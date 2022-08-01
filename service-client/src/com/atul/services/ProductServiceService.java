/**
 * ProductServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.atul.services;

public interface ProductServiceService extends javax.xml.rpc.Service {
    public java.lang.String getProductServicePortAddress();

    public com.atul.services.ProductService getProductServicePort() throws javax.xml.rpc.ServiceException;

    public com.atul.services.ProductService getProductServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
