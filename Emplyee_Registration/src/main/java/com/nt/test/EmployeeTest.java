package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.EmployeeTestController;
import com.nt.vo.EmployeeVo;

public class EmployeeTest {
	public static void main(String[] args) {
	Scanner sc=null;
	String ename=null,eadd=null,enatsal=null,egrossal=null;
	EmployeeVo vo=null;
	DefaultListableBeanFactory factory=null;
	XmlBeanDefinitionReader reader=null;
	EmployeeTestController controller=null;
	String result=null;
	//read scanner type
	sc=new Scanner(System.in);
	
	System.out.println("Enter the Employee Name::");
	ename=sc.next();
	System.out.println("Enter the Employee Address::");
	eadd=sc.next();
	System.out.println("Enter the  Employee Netsalary::");
	enatsal=sc.next();
	System.out.println("Ente the   Employee Grosssal::");
	egrossal=sc.next();
	vo=new EmployeeVo();
	//set the value on vo object
	vo.setEname(ename);vo.setEadd(eadd);vo.setEnatsal(enatsal);vo.setEgrossal(egrossal);
		//create the factory object
	factory=new DefaultListableBeanFactory();
	reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfg/applicationContext.xml");
	//get the coontroller
	controller=factory.getBean("controller",EmployeeTestController.class);
		//invoke the method
	try {
		result=controller.process(vo);
		System.out.println(result);
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("Internal ...Problem");
	}
	}

}
