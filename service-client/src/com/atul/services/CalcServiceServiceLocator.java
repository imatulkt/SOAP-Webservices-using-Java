/**
 * CalcServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.atul.services;

public class CalcServiceServiceLocator extends org.apache.axis.client.Service implements com.atul.services.CalcServiceService {

    public CalcServiceServiceLocator() {
    }


    public CalcServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalcServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalcServicePort
    private java.lang.String CalcServicePort_address = "http://localhost:8081/calc-service";

    public java.lang.String getCalcServicePortAddress() {
        return CalcServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalcServicePortWSDDServiceName = "CalcServicePort";

    public java.lang.String getCalcServicePortWSDDServiceName() {
        return CalcServicePortWSDDServiceName;
    }

    public void setCalcServicePortWSDDServiceName(java.lang.String name) {
        CalcServicePortWSDDServiceName = name;
    }

    public com.atul.services.CalcService getCalcServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalcServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalcServicePort(endpoint);
    }

    public com.atul.services.CalcService getCalcServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.atul.services.CalcServiceServiceSoapBindingStub _stub = new com.atul.services.CalcServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalcServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalcServicePortEndpointAddress(java.lang.String address) {
        CalcServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.atul.services.CalcService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.atul.services.CalcServiceServiceSoapBindingStub _stub = new com.atul.services.CalcServiceServiceSoapBindingStub(new java.net.URL(CalcServicePort_address), this);
                _stub.setPortName(getCalcServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CalcServicePort".equals(inputPortName)) {
            return getCalcServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.atul.com/", "CalcServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.atul.com/", "CalcServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalcServicePort".equals(portName)) {
            setCalcServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
