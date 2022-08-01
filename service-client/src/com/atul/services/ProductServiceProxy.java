package com.atul.services;

public class ProductServiceProxy implements com.atul.services.ProductService {
  private String _endpoint = null;
  private com.atul.services.ProductService productService = null;
  
  public ProductServiceProxy() {
    _initProductServiceProxy();
  }
  
  public ProductServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductServiceProxy();
  }
  
  private void _initProductServiceProxy() {
    try {
      productService = (new com.atul.services.ProductServiceServiceLocator()).getProductServicePort();
      if (productService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productService != null)
      ((javax.xml.rpc.Stub)productService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.atul.services.ProductService getProductService() {
    if (productService == null)
      _initProductServiceProxy();
    return productService;
  }
  
  public com.atul.services.Product find(java.lang.String arg0) throws java.rmi.RemoteException{
    if (productService == null)
      _initProductServiceProxy();
    return productService.find(arg0);
  }
  
  public java.lang.String create(com.atul.services.Product arg0) throws java.rmi.RemoteException{
    if (productService == null)
      _initProductServiceProxy();
    return productService.create(arg0);
  }
  
  
}