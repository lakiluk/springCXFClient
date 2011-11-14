package org.luke;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import model.UserImpl;

import org.apache.log4j.Logger;
import org.luke.component.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.HelloWorld;
import service.HelloWorld_PortType;
import service.HelloWorld_ServiceLocator;
import service.User;

public class ApplicationStart {

	private static final Logger logger = Logger
			.getLogger(ApplicationStart.class);

	public static void main(String[] args) throws ServiceException,
			RemoteException {
		executeWebServiceUsingGeneratedClient();
		executeServiceUsingSpring();

	}

	private static void executeWebServiceUsingGeneratedClient()
			throws ServiceException, RemoteException {
		HelloWorld_ServiceLocator locator = new HelloWorld_ServiceLocator();
		HelloWorld_PortType port = (HelloWorld_PortType) locator
				.getPort(HelloWorld_PortType.class);
		port.sayHiToUser(new User("Mr T."));
	}

	private static void executeServiceUsingSpring() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Employee employeeBean = ctx.getBean(Employee.class);
		logger.info("Employee bean:" + employeeBean.getName() + " "
				+ employeeBean.getJob());
		HelloWorld helloWorldService = (HelloWorld) ctx.getBean("helloClient");
		model.User user = new UserImpl("SlimShady");
		System.out
				.println("sayHiToUser " + helloWorldService.sayHiToUser(user));
		System.out.println(helloWorldService.getUsers().size());
		try {
			helloWorldService.beware();
		} catch (exception.SomeSeriousException e) {
			System.err.println("Exception was catched " + e.getMessage());
		}
	}
}
