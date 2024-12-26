package in.resourses;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.beans.first;

@Configuration
public class springconfigfile {
	@Bean
	public first hId() {
		first s=new first();
		s.setName("Hello World");
		return s;
				
		
	}

}
