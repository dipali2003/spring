package in.dl.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.dl.beans.pojo;
import in.dl.resources.spring_javafile;

public class main {

	public static void main(String[] args) {
		ApplicationContext context=new  AnnotationConfigApplicationContext(spring_javafile.class);
		
         pojo pid1=(pojo) context.getBean("pid");
         pid1.dispaly();
         System.out.println("===============");
         
         
         
	}

}
