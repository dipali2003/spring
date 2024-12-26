package in.dm.SpringWith_JDBCCrud;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.dm.bean.flawer;
import in.dm.mappers.flawerRowMapper;
import in.dm.resources.springConfigFile;


public class App 
{
    public static void main( String[] args )
    {
    	
    	
       ApplicationContext context=new AnnotationConfigApplicationContext(springConfigFile.class);
       JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
      
       //---------insert operation----//
            
              //String name="kamal";
  	          //String color="blue";

              // String insert_sql_query="INSERT INTO flawer VALUES(?,?)";
       
             //     int count=jdbcTemplate.update(insert_sql_query,name,color);
       
              //   if(count>0) {
    	      //     System.out.println("insersion sucessfully");
               //    }
                 //  else
                   // {
   	                //System.out.println("failed");
                     //}
    	   
       
           //-------update operation------//
              
               //      String name="lily";
               //       String color="red";
    		   
    	      //   String update_sql_query="update  flawer SET name=? WHERE color=?";
           
             //  int count=jdbcTemplate.update(update_sql_query,name,color);
           
             //  if(count>0) {
             //	   System.out.println("update sucessfully");
            //    }
            // else
            //    {
        	//   System.out.println("failed");
            //   }
       
       
      
       
       //-----delete operation------//    
          
          //  String color="red";
		   
	      // String dalate_sql_query="DELETE FROM  flawer WHERE color=?";
       
         // int count=jdbcTemplate.update(dalate_sql_query,color);
       
        //  if(count>0) {
    	//   System.out.println("delete sucessfully");
        // }
        // else
        //{
    	//   System.out.println("failed");
        // }
   
       
       
       //-------------select operation---------------//
       
       String select_sql_query="SELECT * FROM flawer";
       List<flawer>f_list= jdbcTemplate.query(select_sql_query,new flawerRowMapper());
       for(flawer f:f_list)
       {
    	   System.out.println("name : "+f.getName());
    	   System.out.println("color : "+f.getColor());
    	   
    	   System.out.println("------------");
       }
       
       
       
    }
}
