/**
 * HelloWorld_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface HelloWorld_Service extends javax.xml.rpc.Service {
    public java.lang.String getHelloWorldImplPortAddress();

    public service.HelloWorld_PortType getHelloWorldImplPort() throws javax.xml.rpc.ServiceException;

    public service.HelloWorld_PortType getHelloWorldImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
