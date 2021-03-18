package modullager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SaleOrderDB implements SaleOrderDBIF {
	private static final String findByIdq = "select * from order where id = ?";
	private PreparedStatement findById;
	private static final String findbyIdAndQuantityQ = "select * from product where id = ? and  quantity = ?";
	private PreparedStatement findByIdandQuantity; 
	private int id; 
	

	public SaleOrderDB() {

		try {
			findById = DBConnection.getInstance().getConnection().prepareStatement(findByIdq);
			findByIdandQuantity = DBConnection.getInstance().getConnection().prepareStatement(findbyIdAndQuantityQ);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void createOrder() {
		
	}

	@Override
	public void findByID(int invoiceId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product findProduct(int productId) throws SQLException {
		findByIdandQuantity.setInt(1, id);
		ResultSet rs = findByIdandQuantity.executeQuery();
		Product p = null;
		if (rs.next()) {
			p = buildObject(rs);

		}

		return p;

	}

	private Product buildObject(ResultSet rs) throws SQLException {
		Product p = new Product(rs.getString("name"), rs.getInt("purchaseprice"), rs.getInt("salesprice"),
				rs.getInt("rentprice"), rs.getString("countryOfOrigin"), rs.getInt("productId"));
		return p;
	}

	@Override
	public void endSale() {
		
		
	}

}
