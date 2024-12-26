package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.student;
import in.sp.resources.springConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(springConfig.class);
		student std=context.getBean(student.class);
		std.display();

	}

}
