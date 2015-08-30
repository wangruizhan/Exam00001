package com.tutorialspoint;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class FilmJDBCTemplate implements FilmDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		
	}
	public void create(String title, String description,Integer language_id) {
		String SQL = "insert into Student(title,description,language_id) values(?,?,?)";
		jdbcTemplateObject.update(SQL,title,description,language_id);
		//System.out.println("Created Record Name = "+name+"Age="+age);
		return;
		
	}


}
