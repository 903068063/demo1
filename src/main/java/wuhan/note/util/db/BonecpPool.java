package wuhan.note.util.db;

import java.sql.Connection;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;

public class BonecpPool {
	private static Connection connection;
	private BoneCP connectionPool = null;
	private static BonecpPool pool;
	private String driver = DBdriver.MYSQL_Driver;
	private String jdbcUrl = "jdbc:mysql://45.79.100.6:3306/ithub";
	private String username = "ithub";
	private String password = "xiu.com2015";
	static {
		pool = new BonecpPool();
	}
	private BonecpPool() {
		try {
			Class.forName(driver);
			// setup the connection pool
			BoneCPConfig config = new BoneCPConfig();
			config.setJdbcUrl(jdbcUrl);
			config.setUsername(username);
			config.setPassword(password);
			// 设置每60秒检查数据库中的空闲连接数
			config.setIdleConnectionTestPeriod(60);
			// 设置连接空闲时间
			config.setIdleMaxAge(240);
			// 设置每个分区中的最大连接数 30
			config.setMaxConnectionsPerPartition(30);
			// 设置每个分区中的最小连接数 10
			config.setMinConnectionsPerPartition(10);
			// 当连接池中的连接耗尽的时候 BoneCP一次同时获取的连接数
			config.setAcquireIncrement(5);
			// 连接释放处理
			config.setReleaseHelperThreads(3);
			// 设置分区 分区数为3
			config.setPartitionCount(3);
			// 设置配置参数
			connectionPool = new BoneCP(config); // setup the connection pool
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static BonecpPool getInstance() {
		return pool;
	}

	public Connection getConnection() {
		try {
			connection = connectionPool.getConnection(); // fetch a connection
			connectionPool.shutdown(); // shutdown connection pool.
		} catch (Exception e) {

		}
		return connection;
	}
}
