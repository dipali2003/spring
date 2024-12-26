package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.student;

@Configuration
public class springConfig {
	@Bean
       public Address createAddObj() {
    	   
    	   Address addr=new Address();
    	   
    	   addr.setHouseno(1234);
    	   addr.setName("niwas");
    	   addr.setPincode(1234556);
		return addr;
    	   
    	   
     }
       @Bean
       public student createStdObj()
       {
    	   student std=new student();
    	   
    	   std.setName("dipali");
    	   std.setNo(1);
    	 //  std.setAddress(createAddObj());
		return std;
    	   
    	   
       }

}
