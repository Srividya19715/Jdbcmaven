package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import entity.Student;
import exception.DaoException;

public class Databaseimp implements Database{

	@Override
	public boolean createconnect(List<Student> s) throws DaoException {
		
		boolean dconnect=true;
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
			
			String sql="INSERT INTO details(id,first_name,last_name)VALUES(?,?,?)";
			
			int count=0;
				
			PreparedStatement ps=con.prepareStatement(sql);
			
			for(Student s1:s)
				
			{

				ps.setInt(1, s1.getRollno());
				ps.setString(2, s1.getFirstname());
				ps.setString(3, s1.getLastname());
				
				
				ps.executeUpdate();
				
			//	ps.addBatch();
			//	count++;
				
				
			//if(count %100 ==0 || count==s.size())
				//	ps.executeBatch();
			
				dconnect=true;
			}
			
			if(!dconnect)
				throw  new DaoException("Error in database");
			
			System.out.println("records inserted!!");
		}
		catch(DaoException e)
		{
			System.out.println(e);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		return dconnect;
		
		
		
	}

}
