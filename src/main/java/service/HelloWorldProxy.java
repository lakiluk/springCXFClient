package service;

public class HelloWorldProxy implements service.HelloWorld_PortType {
  private String _endpoint = null;
  private service.HelloWorld_PortType helloWorld_PortType = null;
  
  public HelloWorldProxy() {
    _initHelloWorldProxy();
  }
  
  public HelloWorldProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWorldProxy();
  }
  
  private void _initHelloWorldProxy() {
    try {
      helloWorld_PortType = (new service.HelloWorld_ServiceLocator()).getHelloWorldImplPort();
      if (helloWorld_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWorld_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWorld_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWorld_PortType != null)
      ((javax.xml.rpc.Stub)helloWorld_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.HelloWorld_PortType getHelloWorld_PortType() {
    if (helloWorld_PortType == null)
      _initHelloWorldProxy();
    return helloWorld_PortType;
  }
  
  public java.lang.String sayHi(java.lang.String arg0) throws java.rmi.RemoteException{
    if (helloWorld_PortType == null)
      _initHelloWorldProxy();
    return helloWorld_PortType.sayHi(arg0);
  }
  
  public java.lang.String sayHiToUser(service.User arg0) throws java.rmi.RemoteException{
    if (helloWorld_PortType == null)
      _initHelloWorldProxy();
    return helloWorld_PortType.sayHiToUser(arg0);
  }
  
  public java.lang.String echo() throws java.rmi.RemoteException{
    if (helloWorld_PortType == null)
      _initHelloWorldProxy();
    return helloWorld_PortType.echo();
  }
  
  public service.IdentyfiedUser[] getUsers() throws java.rmi.RemoteException{
    if (helloWorld_PortType == null)
      _initHelloWorldProxy();
    return helloWorld_PortType.getUsers();
  }
  
  public java.lang.String beware() throws java.rmi.RemoteException, service.SomeSeriousException{
    if (helloWorld_PortType == null)
      _initHelloWorldProxy();
    return helloWorld_PortType.beware();
  }
  
  
}