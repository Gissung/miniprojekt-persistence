package modullager;

import java.sql.SQLException;

public interface SaleOrderDBIF {

	 
	void findByID(int invoiceId);

	void createOrder();

	Product findProduct(int productId) throws SQLException;

	void endSale();

}
