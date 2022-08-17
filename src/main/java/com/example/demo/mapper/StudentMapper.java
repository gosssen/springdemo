package com.example.demo.mapper;

import com.example.demo.model.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Insert("INSERT INTO student(name, score, graduate, create_date) VALUES (#{name}, #{score}, #{graduate}, #{createDate})")
    void insert(Student student);

    @Update("UPDATE student SET name = #{name}, score = #{score}, graduate = #{graduate} WHERE id = #{id})")
    void update(Student student);

    @Select("SELECT * FROM student WHERE id = #{id}")
    Student getById(@Param("id") Integer id);

    @Delete("DELETE FROM student WHERE id = #{id}")
    void deleteById(@Param("id")Integer id);

    @Select("SELECT * FROM student")
    List<Student> getAll();

}
