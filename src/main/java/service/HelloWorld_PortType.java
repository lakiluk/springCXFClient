/**
 * HelloWorld_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface HelloWorld_PortType extends java.rmi.Remote {
    public java.lang.String sayHi(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String sayHiToUser(service.User arg0) throws java.rmi.RemoteException;
    public java.lang.String echo() throws java.rmi.RemoteException;
    public service.IdentyfiedUser[] getUsers() throws java.rmi.RemoteException;
    public java.lang.String beware() throws java.rmi.RemoteException, service.SomeSeriousException;
}
