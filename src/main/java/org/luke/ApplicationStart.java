package org.luke;

import model.User;
import model.UserImpl;

import org.apache.log4j.Logger;
import org.luke.component.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.HelloWorld;

public class ApplicationStart {

	private static final Logger logger = Logger
			.getLogger(ApplicationStart.class);

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Employee employeeBean = ctx.getBean(Employee.class);
		logger.info("Employee bean:" + employeeBean.getName() + " "
				+ employeeBean.getJob());
		HelloWorld helloWorldService = (HelloWorld) ctx.getBean("helloClient");
		User user = new UserImpl("SlimShady");
		System.out.println("sayHiToUser " +helloWorldService.sayHiToUser(user));
		System.out.println(helloWorldService.getUsers().size());
	}
}
