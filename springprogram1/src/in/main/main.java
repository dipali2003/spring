package in.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.beans.first;
import in.resourses.springconfigfile;


public class main {
	public static void main(String args[]) {
		ApplicationContext context=new AnnotationConfigApplicationContext(springconfigfile.class);
		
		first s=(first)context.getBean("hId");
		s.dispaly();
	}

}
