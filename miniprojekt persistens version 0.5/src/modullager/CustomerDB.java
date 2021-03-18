package modullager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDB implements CustomerDBIF {
	private final static String findByPhoneQ = "select * from Customer where phoneno = ?";
	private PreparedStatement findByPhone;

	public CustomerDB() {
		try {
			findByPhone = DBConnection.getInstance().getConnection().prepareStatement(findByPhoneQ);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Customer findCustomer(String phoneno) throws SQLException {

		findByPhone.setString(1, phoneno);
		ResultSet rs = findByPhone.executeQuery();
		Customer c = null;
		if (rs.next()) {
			c = buildObject(rs);

		}
		return c;

	}

	private Customer buildObject(ResultSet rs) throws SQLException {
		Customer c = new Customer(rs.getNString("name"), rs.getString("address"), rs.getInt("zipCode"),
				rs.getString("city"), rs.getString("phoneno"), rs.getNString("customerType"));
		return c;
	}

}
