package service;

import java.util.List;

import dao.Database;
import dao.Databaseimp;
import entity.Student;
import exception.DaoException;
import exception.ServiceException;

public class Serviceimp implements Studentservice{

	@Override
	public boolean insertrecord(List<Student> s) throws ServiceException {
		// TODO Auto-generated method stub
		boolean connect=true;
		Database db=new Databaseimp();
		
		 try {
			 
			connect= db.createconnect(s);
			
			if(!connect)
				throw new DaoException("Error in database");
		}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return connect;
		
	}

}
