package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.bean.EnggCourse;

public class BeanObjTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reder=null;
		EnggCourse b1st=null,sdyr=null;
		
		//create the IOC object
		factory=new DefaultListableBeanFactory();
		reder=new XmlBeanDefinitionReader(factory);
		reder.loadBeanDefinitions("com/nt/cfg/applicationContext.xml");
		/*
		 * b1st=factory.getBean("b1st",EnggCourse.class); System.out.println(b1st);
		 */
		sdyr=factory.getBean("sdyr",EnggCourse.class);
		System.out.println(sdyr);
	}

}
