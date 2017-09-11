package wuhan.note.util.db;

import java.sql.Connection;

public abstract class Pool {

	public abstract Connection getConnection();
	
}
