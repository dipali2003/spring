package in.dm.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration

public class springConfigFile {
	
	@Bean
	public DriverManagerDataSource myDataSource()
	{
		
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		
		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springJdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("dipali@123");
		
		
		
		return dataSource;
	}
	@Bean
	
	public JdbcTemplate myJdbeTemplate()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		
		jdbcTemplate.setDataSource(myDataSource());
		return jdbcTemplate;
		
	}
	

}
