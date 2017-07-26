package com.apex.user.service;

public class UserServiceProxy implements com.apex.user.service.UserService {
  private String _endpoint = null;
  private com.apex.user.service.UserService userService = null;
  
  public UserServiceProxy() {
    _initUserServiceProxy();
  }
  
  public UserServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserServiceProxy();
  }
  
  private void _initUserServiceProxy() {
    try {
      userService = (new com.apex.user.service.UserServiceServiceLocator()).getUserService();
      if (userService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userService != null)
      ((javax.xml.rpc.Stub)userService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.apex.user.service.UserService getUserService() {
    if (userService == null)
      _initUserServiceProxy();
    return userService;
  }
  
  public int add(int i, int j) throws java.rmi.RemoteException{
    if (userService == null)
      _initUserServiceProxy();
    return userService.add(i, j);
  }
  
  public java.util.Calendar getServerDate() throws java.rmi.RemoteException{
    if (userService == null)
      _initUserServiceProxy();
    return userService.getServerDate();
  }
  
  public java.lang.String sayHelloWithName(java.lang.String name) throws java.rmi.RemoteException{
    if (userService == null)
      _initUserServiceProxy();
    return userService.sayHelloWithName(name);
  }
  
  public com.apex.user.service.vo.Employee getEmployee(int empId) throws java.rmi.RemoteException{
    if (userService == null)
      _initUserServiceProxy();
    return userService.getEmployee(empId);
  }
  
  public java.lang.String sayHello() throws java.rmi.RemoteException{
    if (userService == null)
      _initUserServiceProxy();
    return userService.sayHello();
  }
  
  
}