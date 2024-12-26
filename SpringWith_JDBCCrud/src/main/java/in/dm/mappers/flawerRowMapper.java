package in.dm.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.dm.bean.flawer;

public class flawerRowMapper implements RowMapper<flawer>
{

	@Override
	public flawer mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		flawer f=new flawer();
		f.setName(rs.getString("name"));
		f.setColor(rs.getString("color"));
		
		return f;
	}

	
	
	
	

}
