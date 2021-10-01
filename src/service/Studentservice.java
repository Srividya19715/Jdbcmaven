package service;

import java.util.List;

import entity.Student;
import exception.ServiceException;

public interface Studentservice {
	
	public boolean insertrecord( List <Student>s) throws ServiceException;
	

}
