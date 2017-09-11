package wuhan.note.util.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainTxt {
	public static void mysql() {
		try {
		String sql = "select * FROM supplier_ftp";
		Connection cn=	DBUtil.getConnection();
		PreparedStatement pstm = cn.prepareStatement(sql);
		ResultSet  rs = pstm.executeQuery();
		while (rs.next()) {
			String id = rs.getString("supplier_id");
			System.err.println(id);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		mysql();
	}
}
