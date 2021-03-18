package controller;

import java.sql.SQLException;

import modullager.CustomerDBIF;

public class CustomerController {
private CustomerDBIF cdif;
private String phoneno;
	
		
		
	
	public void findCustomer(String phoneno) throws SQLException {
		// TODO Auto-generated method stub
		cdif.findCustomer( phoneno);
	}

}
