/**
 * CalcServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.atul.services;

public interface CalcServiceService extends javax.xml.rpc.Service {
    public java.lang.String getCalcServicePortAddress();

    public com.atul.services.CalcService getCalcServicePort() throws javax.xml.rpc.ServiceException;

    public com.atul.services.CalcService getCalcServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
