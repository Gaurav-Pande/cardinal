/*
 * Copyright © 2015 TCS and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.cardinal.impl;

// jmx imports
//
import com.sun.management.snmp.SnmpStatusException;

/**
 * This interface is used for representing the remote management interface for
 * the "OdlCardinalProjectModule" MBean.
 */
public interface OdlCardinalProjectModuleMBean {

    /**
     * Getter for the "OdlMDSALBGPBMPinfo" variable.
     */
    public String getOdlMDSALBGPBMPinfo() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALBGPBMPinfo" variable.
     */
    public void setOdlMDSALBGPBMPinfo(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALBGPBMPinfo" variable.
     */
    public void checkOdlMDSALBGPBMPinfo(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALBGPRIBInfo" variable.
     */
    public String getOdlMDSALBGPRIBInfo() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALBGPRIBInfo" variable.
     */
    public void setOdlMDSALBGPRIBInfo(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALBGPRIBInfo" variable.
     */
    public void checkOdlMDSALBGPRIBInfo(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALBGPPeerInfo" variable.
     */
    public String getOdlMDSALBGPPeerInfo() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALBGPPeerInfo" variable.
     */
    public void setOdlMDSALBGPPeerInfo(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALBGPPeerInfo" variable.
     */
    public void checkOdlMDSALBGPPeerInfo(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALOpenFlowOVSconnectedDevices" variable.
     */
    public String getOdlMDSALOpenFlowOVSconnectedDevices() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALOpenFlowOVSconnectedDevices" variable.
     */
    public void setOdlMDSALOpenFlowOVSconnectedDevices(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALOpenFlowOVSconnectedDevices" variable.
     */
    public void checkOdlMDSALOpenFlowOVSconnectedDevices(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALIotDMlistofNodes" variable.
     */
    public String getOdlMDSALIotDMlistofNodes() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALIotDMlistofNodes" variable.
     */
    public void setOdlMDSALIotDMlistofNodes(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALIotDMlistofNodes" variable.
     */
    public void checkOdlMDSALIotDMlistofNodes(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALIotDMlistofAEs" variable.
     */
    public String getOdlMDSALIotDMlistofAEs() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALIotDMlistofAEs" variable.
     */
    public void setOdlMDSALIotDMlistofAEs(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALIotDMlistofAEs" variable.
     */
    public void checkOdlMDSALIotDMlistofAEs(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALIotDMListofcse" variable.
     */
    public String getOdlMDSALIotDMListofcse() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALIotDMListofcse" variable.
     */
    public void setOdlMDSALIotDMListofcse(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALIotDMListofcse" variable.
     */
    public void checkOdlMDSALIotDMListofcse(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALGBPPolicytenants" variable.
     */
    public String getOdlMDSALGBPPolicytenants() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALGBPPolicytenants" variable.
     */
    public void setOdlMDSALGBPPolicytenants(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALGBPPolicytenants" variable.
     */
    public void checkOdlMDSALGBPPolicytenants(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALGBPFaaslogicalnetwork" variable.
     */
    public String getOdlMDSALGBPFaaslogicalnetwork() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALGBPFaaslogicalnetwork" variable.
     */
    public void setOdlMDSALGBPFaaslogicalnetwork(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALGBPFaaslogicalnetwork" variable.
     */
    public void checkOdlMDSALGBPFaaslogicalnetwork(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALService" variable.
     */
    public String getOdlMDSALService() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALService" variable.
     */
    public void setOdlMDSALService(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALService" variable.
     */
    public void checkOdlMDSALService(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALServicefunctiontype" variable.
     */
    public String getOdlMDSALServicefunctiontype() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALServicefunctiontype" variable.
     */
    public void setOdlMDSALServicefunctiontype(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALServicefunctiontype" variable.
     */
    public void checkOdlMDSALServicefunctiontype(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALSfcfunctionAlgorithms" variable.
     */
    public String getOdlMDSALSfcfunctionAlgorithms() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALSfcfunctionAlgorithms" variable.
     */
    public void setOdlMDSALSfcfunctionAlgorithms(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALSfcfunctionAlgorithms" variable.
     */
    public void checkOdlMDSALSfcfunctionAlgorithms(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALSfcfunctiongroups" variable.
     */
    public String getOdlMDSALSfcfunctiongroups() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALSfcfunctiongroups" variable.
     */
    public void setOdlMDSALSfcfunctiongroups(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALSfcfunctiongroups" variable.
     */
    public void checkOdlMDSALSfcfunctiongroups(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALSfcfunctionchain" variable.
     */
    public String getOdlMDSALSfcfunctionchain() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALSfcfunctionchain" variable.
     */
    public void setOdlMDSALSfcfunctionchain(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALSfcfunctionchain" variable.
     */
    public void checkOdlMDSALSfcfunctionchain(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALSfcfunction" variable.
     */
    public String getOdlMDSALSfcfunction() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALSfcfunction" variable.
     */
    public void setOdlMDSALSfcfunction(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALSfcfunction" variable.
     */
    public void checkOdlMDSALSfcfunction(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALNetconfConnectedDevices" variable.
     */
    public String getOdlMDSALNetconfConnectedDevices() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALNetconfConnectedDevices" variable.
     */
    public void setOdlMDSALNetconfConnectedDevices(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALNetconfConnectedDevices" variable.
     */
    public void checkOdlMDSALNetconfConnectedDevices(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALClustershardsshared" variable.
     */
    public String getOdlMDSALClustershardsshared() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALClustershardsshared" variable.
     */
    public void setOdlMDSALClustershardsshared(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALClustershardsshared" variable.
     */
    public void checkOdlMDSALClustershardsshared(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlMDSALClusterControllerRole" variable.
     */
    public String getOdlMDSALClusterControllerRole() throws SnmpStatusException;

    /**
     * Setter for the "OdlMDSALClusterControllerRole" variable.
     */
    public void setOdlMDSALClusterControllerRole(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlMDSALClusterControllerRole" variable.
     */
    public void checkOdlMDSALClusterControllerRole(String x) throws SnmpStatusException;

}
