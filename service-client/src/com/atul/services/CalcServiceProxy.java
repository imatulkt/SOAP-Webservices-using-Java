package com.atul.services;

public class CalcServiceProxy implements com.atul.services.CalcService {
  private String _endpoint = null;
  private com.atul.services.CalcService calcService = null;
  
  public CalcServiceProxy() {
    _initCalcServiceProxy();
  }
  
  public CalcServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalcServiceProxy();
  }
  
  private void _initCalcServiceProxy() {
    try {
      calcService = (new com.atul.services.CalcServiceServiceLocator()).getCalcServicePort();
      if (calcService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calcService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calcService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calcService != null)
      ((javax.xml.rpc.Stub)calcService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.atul.services.CalcService getCalcService() {
    if (calcService == null)
      _initCalcServiceProxy();
    return calcService;
  }
  
  public double doSum(java.lang.Double arg0, java.lang.Double arg1) throws java.rmi.RemoteException{
    if (calcService == null)
      _initCalcServiceProxy();
    return calcService.doSum(arg0, arg1);
  }
  
  
}