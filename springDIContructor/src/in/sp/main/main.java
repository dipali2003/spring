package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.emp;

public class main {
	public static void main(String args[]) {
		String config_file_loc="/in/sp/resources/applicationContext.xml";
		
		ApplicationContext context=new ClassPathXmlApplicationContext(config_file_loc);
		
		
		emp std= (emp)context.getBean("empId");
		
		std.display();
	}

}