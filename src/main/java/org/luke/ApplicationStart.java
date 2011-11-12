package org.luke;

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
		HelloWorld helloWorldService= (HelloWorld) ctx.getBean("helloClient");
		System.out.println(helloWorldService.sayHi("dupa"));
	}
}
