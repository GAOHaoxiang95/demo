package com.example.demo.mapper;
import java.util.List;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import com.example.demo.controller.User;


public interface UserMapper {
	public List<User> sl();
	
	public List<User> getAll();
	
	void insert(User user);
/*
	@Select("SELECT * FROM user")
	@Results(id="userMap", value= {
		@Result(property = "id", column = "id", jdbcType=JdbcType.INTEGER, id = true),
		@Result(property = "age", column = "age", jdbcType=JdbcType.INTEGER),
		@Result(property = "name", column = "name", jdbcType=JdbcType.VARCHAR)
	})
	List<User> getAll();
	*/
	
	/*
	@Select("SELECT * FROM user where id = #{id}")
	@ResultMap(value="userMap")
	User getOne(int id);
	
	@Insert("INSERT INTO user(name, age) VALUES (#{name}, #{age})")
	void insert(User user);
	
	@Update("UPDATE user SET name = #{userName}, age=#{age} WHERE id = #{}")
	void update(User user);
	
	@Delete("DELETE FROM user WHERE id = #{id}")
	void delete(int id);
	*/
}
