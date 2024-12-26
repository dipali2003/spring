package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.student;

public class Main {
	public static void main(String args[]) {
		String config_file_loc="/in/sp/resources/applicationContext.xml";
		
		ApplicationContext context=new ClassPathXmlApplicationContext(config_file_loc);
		
		
		student std= (student)context.getBean("stdId");
		
		std.display();
	}

}
