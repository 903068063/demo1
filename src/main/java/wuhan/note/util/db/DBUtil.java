package wuhan.note.util.db;

import java.sql.Connection;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection() throws SQLException {
		BonecpPool pool = BonecpPool.getInstance();
		return pool.getConnection();
	}

}
