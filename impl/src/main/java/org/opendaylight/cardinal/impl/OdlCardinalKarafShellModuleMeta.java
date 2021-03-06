/*
 * Copyright © 2015 TCS and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.cardinal.impl;

// java imports
//
import java.io.Serializable;

// jmx imports
//
import javax.management.MBeanServer;
import com.sun.management.snmp.SnmpString;
import com.sun.management.snmp.SnmpValue;
import com.sun.management.snmp.SnmpStatusException;

// jdmk imports
//
import com.sun.management.snmp.agent.SnmpMib;
import com.sun.management.snmp.agent.SnmpMibGroup;
import com.sun.management.snmp.agent.SnmpStandardObjectServer;
import com.sun.management.snmp.agent.SnmpStandardMetaServer;
import com.sun.management.snmp.agent.SnmpMibSubRequest;
import com.sun.management.snmp.agent.SnmpMibTable;

/**
 * The class is used for representing SNMP metadata for the
 * "OdlCardinalKarafShellModule" group. The group is defined with the following
 * oid: 1.3.6.1.3.1.1.7.
 */
public class OdlCardinalKarafShellModuleMeta extends SnmpMibGroup implements Serializable, SnmpStandardMetaServer {

    /**
     * Constructor for the metadata associated to "OdlCardinalKarafShellModule".
     */
    public OdlCardinalKarafShellModuleMeta(SnmpMib myMib, SnmpStandardObjectServer objserv) {
        objectserver = objserv;
        try {
            registerObject(4);
            registerObject(3);
            registerObject(2);
            registerObject(1);
            registerObject(0);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get the value of a scalar variable
     */
    public SnmpValue get(long var, Object data) throws SnmpStatusException {
        switch ((int) var) {
        case 4:
            return new SnmpString(node.getOdlKarafMaxHeapSize());

        case 3:
            return new SnmpString(node.getOdlKarafCurrentHeapSize());

        case 2:
            return new SnmpString(node.getOdlKarafPeakThreads());

        case 1:
            return new SnmpString(node.getOdlKarafDaemonThreads());

        case 0:
            return new SnmpString(node.getOdlKarafLiveThreads());

        default:
            break;
        }
        throw new SnmpStatusException(SnmpStatusException.noSuchObject);
    }

    /**
     * Set the value of a scalar variable
     */
    public SnmpValue set(SnmpValue x, long var, Object data) throws SnmpStatusException {
        switch ((int) var) {
        case 4:
            if (x instanceof SnmpString) {
                node.setOdlKarafMaxHeapSize(((SnmpString) x).toString());
                return new SnmpString(node.getOdlKarafMaxHeapSize());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }

        case 3:
            if (x instanceof SnmpString) {
                node.setOdlKarafCurrentHeapSize(((SnmpString) x).toString());
                return new SnmpString(node.getOdlKarafCurrentHeapSize());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }

        case 2:
            if (x instanceof SnmpString) {
                node.setOdlKarafPeakThreads(((SnmpString) x).toString());
                return new SnmpString(node.getOdlKarafPeakThreads());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }

        case 1:
            if (x instanceof SnmpString) {
                node.setOdlKarafDaemonThreads(((SnmpString) x).toString());
                return new SnmpString(node.getOdlKarafDaemonThreads());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }

        case 0:
            if (x instanceof SnmpString) {
                node.setOdlKarafLiveThreads(((SnmpString) x).toString());
                return new SnmpString(node.getOdlKarafLiveThreads());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }

        default:
            break;
        }
        throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);
    }

    /**
     * Check the value of a scalar variable
     */
    public void check(SnmpValue x, long var, Object data) throws SnmpStatusException {
        switch ((int) var) {
        case 4:
            if (x instanceof SnmpString) {
                node.checkOdlKarafMaxHeapSize(((SnmpString) x).toString());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }
            break;

        case 3:
            if (x instanceof SnmpString) {
                node.checkOdlKarafCurrentHeapSize(((SnmpString) x).toString());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }
            break;

        case 2:
            if (x instanceof SnmpString) {
                node.checkOdlKarafPeakThreads(((SnmpString) x).toString());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }
            break;

        case 1:
            if (x instanceof SnmpString) {
                node.checkOdlKarafDaemonThreads(((SnmpString) x).toString());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }
            break;

        case 0:
            if (x instanceof SnmpString) {
                node.checkOdlKarafLiveThreads(((SnmpString) x).toString());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }
            break;

        default:
            throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);
        }
    }

    /**
     * Allow to bind the metadata description to a specific object.
     */
    protected void setInstance(OdlCardinalKarafShellModuleMBean var) {
        node = var;
    }

    // ------------------------------------------------------------
    //
    // Implements the "get" method defined in "SnmpMibGroup".
    // See the "SnmpMibGroup" Javadoc API for more details.
    //
    // ------------------------------------------------------------

    public void get(SnmpMibSubRequest req, int depth) throws SnmpStatusException {
        objectserver.get(this, req, depth);
    }

    // ------------------------------------------------------------
    //
    // Implements the "set" method defined in "SnmpMibGroup".
    // See the "SnmpMibGroup" Javadoc API for more details.
    //
    // ------------------------------------------------------------

    public void set(SnmpMibSubRequest req, int depth) throws SnmpStatusException {
        objectserver.set(this, req, depth);
    }

    // ------------------------------------------------------------
    //
    // Implements the "check" method defined in "SnmpMibGroup".
    // See the "SnmpMibGroup" Javadoc API for more details.
    //
    // ------------------------------------------------------------

    public void check(SnmpMibSubRequest req, int depth) throws SnmpStatusException {
        objectserver.check(this, req, depth);
    }

    /**
     * Returns true if "arc" identifies a scalar object.
     */
    public boolean isVariable(long arc) {

        switch ((int) arc) {
        case 4:
        case 3:
        case 2:
        case 1:
        case 0:
            return true;
        default:
            break;
        }
        return false;
    }

    /**
     * Returns true if "arc" identifies a readable scalar object.
     */
    public boolean isReadable(long arc) {

        switch ((int) arc) {
        case 4:
        case 3:
        case 2:
        case 1:
        case 0:
            return true;
        default:
            break;
        }
        return false;
    }

    // ------------------------------------------------------------
    //
    // Implements the "skipVariable" method defined in "SnmpMibGroup".
    // See the "SnmpMibGroup" Javadoc API for more details.
    //
    // ------------------------------------------------------------

    public boolean skipVariable(long var, Object data, int pduVersion) {
        return false;
    }

    /**
     * Return the name of the attribute corresponding to the SNMP variable
     * identified by "id".
     */
    public String getAttributeName(long id) throws SnmpStatusException {
        switch ((int) id) {
        case 4:
            return "OdlKarafMaxHeapSize";

        case 3:
            return "OdlKarafCurrentHeapSize";

        case 2:
            return "OdlKarafPeakThreads";

        case 1:
            return "OdlKarafDaemonThreads";

        case 0:
            return "OdlKarafLiveThreads";

        default:
            break;
        }
        throw new SnmpStatusException(SnmpStatusException.noSuchObject);
    }

    /**
     * Returns true if "arc" identifies a table object.
     */
    public boolean isTable(long arc) {

        switch ((int) arc) {
        default:
            break;
        }
        return false;
    }

    /**
     * Returns the table object identified by "arc".
     */
    public SnmpMibTable getTable(long arc) {
        return null;
    }

    /**
     * Register the group's SnmpMibTable objects with the meta-data.
     */
    public void registerTableNodes(SnmpMib mib, MBeanServer server) {
    }

    protected OdlCardinalKarafShellModuleMBean node;
    protected SnmpStandardObjectServer objectserver = null;
}
