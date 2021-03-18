package uiLager;

import java.sql.SQLException;

import controller.CustomerController;
import controller.SaleOrderController;

public class UI {
	private SaleOrderController soc;
	private CustomerController coc;
	private String phoneno; 
	private int productId;
	
	public void createOrder() {
	soc.createOrder();	
	}

	public void addCustomerToOrder() throws SQLException {
		coc.findCustomer(phoneno);
	}

	public void addProductToOrderLine() throws SQLException {
		soc.addProductTOrderLine(productId);
	}

	public void endsale() {
		soc.endSale();
	}
}
