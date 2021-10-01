package dao;

import java.util.List;

import entity.Student;
import exception.DaoException;

public interface Database {
	
	public boolean createconnect(List <Student>s) throws DaoException;

}
