package modullager;

import java.sql.SQLException;

public interface CustomerDBIF {

	Customer findCustomer(String phoneno) throws SQLException;

}
