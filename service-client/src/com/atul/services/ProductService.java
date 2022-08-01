/**
 * ProductService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.atul.services;

public interface ProductService extends java.rmi.Remote {
    public com.atul.services.Product find(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String create(com.atul.services.Product arg0) throws java.rmi.RemoteException;
}
