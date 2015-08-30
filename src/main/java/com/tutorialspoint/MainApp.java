package com.tutorialspoint;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		StudentJDBCTemplate studentJDBCTemplate = 
//				(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
		
		FilmJDBCTemplate film  = (FilmJDBCTemplate)context.getBean("film");
		//System.out.println("-----Records Creation-----");
//		studentJDBCTemplate.create("Zara", 11);
//		studentJDBCTemplate.create("Nuha", 2);
//		studentJDBCTemplate.create("Ayan", 15);
		//System.out.println("-------Listing Muliple Records---");
//		List<Student> students = studentJDBCTemplate.listStudents();
//		for(Student record : students){
//			System.out.println("ID :" + record.getId());
//			System.out.println(",Name:"+record.getName());
//			System.out.println(",Age:"+record.getAge());
//		}
//		System.out.println("-----Updating Record with ID=2-------");
//		studentJDBCTemplate.update(2, 20);
//		System.out.println("------Listing Record with Id =2------");
//		Student student = studentJDBCTemplate.getStudent(2);
//		System.out.println("ID:"+student.getId());
//		System.out.println(",Name:"+ student.getName());
//		System.out.println(",Age:"+student.getAge());
		// ((AbstractApplicationContext) context).start();
		
//		Scanner sn  = new  Scanner(System.in);
//		System.out.println("请输入姓名:");
//		String name = sn.next();
//		System.out.println("请输入年龄:");
//		int age = sn.nextInt();
//		studentJDBCTemplate.create(name, age);
		// ((AbstractApplicationContext) context).stop();
		((AbstractApplicationContext) context).start();
		Scanner sn = new Scanner(System.in);
		System.out.println("请输入电影名称：");
		String title = sn.next();
		System.out.println("请输入电影描述：");
		String description = sn.next();
		System.out.println("请输入语言ID:");
		Integer language_id = sn.nextInt();
		//String language_id1 =Integer.toHexString(language_id);
		film.create(title, description, language_id);
		//System.out.println(film);
		
		
		

	}

}
