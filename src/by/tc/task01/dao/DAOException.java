package by.tc.task01.dao;

public class DAOException extends Exception{
	
	public DAOException() {
		super();
	}
	
	public DAOException(String messege) {
		super(messege);
	}
	
	public DAOException(String messege, Exception e) {
		super(messege, e);
	}
	
	public DAOException(Exception e) {
		super(e);
	}
	
	

}
