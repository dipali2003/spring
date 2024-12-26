package in.dl.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in_dl_beans.student;



public class main {
	

	public static void main(String args[]) {
		String config_loc="/in/dl/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
		
		student std=(student) context.getBean("stdId");
		std.display();
		System.out.println("====================");
		student std1=(student) context.getBean("stdId1");
		std1.display();
		
		System.out.println("==================");
		
		
		
		
		
	}
}
