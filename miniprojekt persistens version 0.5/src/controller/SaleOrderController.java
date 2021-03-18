package controller;

import java.sql.SQLException;

import modullager.SaleOrderDBIF;
import modullager.Order;
public class SaleOrderController {
SaleOrderDBIF soif; 
private int productId; 
private int quantity; 
public Order() {
	
}
	public void createOrder() {
	soif.createOrder(); 
		
	} 
	public void findById() {
	soif.findByID(productId);	
	}
	public void addProductTOrderLine(int productId) throws SQLException {
		// TODO Auto-generated method stub
	soif.findProduct( productId);	
	}
	public void endSale() {
		// TODO Auto-generated method stub
	soif.endSale();	
	}

}
