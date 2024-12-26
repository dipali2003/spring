package in.dl.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.dl.beans.pojo;

@Configuration
public class spring_javafile {
	@Bean
	
	public pojo pid()
	{
		pojo pid1=new pojo();
		pid1.setName("aman");
		pid1.setRollno(105);
		pid1.setEmail("aman@gmail.com");
		return pid1;
		
	}
	
	
}
