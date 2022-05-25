package edu.shopping;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	
	public static void main(String args[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	ProdPojo p1=(ProdPojo)context.getBean("prodPojoBean");
	UserPojo user=(UserPojo)context.getBean("userPojoBean");
	user.setName("Lasya");
	System.out.println("User Details:"+user);
	
	//p1.setProdName("Dell Inspiron");
	//p1.setPrice(70000.00);
	System.out.println("Product Name:"+p1.getProdName());
	System.out.println("Cost:"+p1.getPrice());
//	AccountPojo acc=(AccountPojo)context.getBean("accountPojoBean");
//	acc.setAccNo(989238938);
//	System.out.println("Account Number:"+acc.getAccNo());
	((AbstractApplicationContext) context).close();
}
}