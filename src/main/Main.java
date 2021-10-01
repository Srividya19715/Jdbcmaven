package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Student;
import exception.ServiceException;
import service.Serviceimp;
import service.Studentservice;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Enter number of student records");
		
		//int n=scan.nextInt();

		List<Student> s = new ArrayList <Student>();
		
		

		System.out.println("Enter roll number:");

		int r = scan.nextInt();

		System.out.println("Enter first name:");

		String fn = scan.next();

		System.out.println("Enter last name:");

		String ln = scan.next();

		s.add(new Student(r, fn, ln));

		boolean inserted = true;
		try
		{
			Studentservice st = new Serviceimp();

			inserted = st.insertrecord(s);

			if (!inserted)
				throw new ServiceException("Records not inserted");
		} 
		catch (ServiceException e) 
		{
			System.out.println(e);
		}
		
	}
}
