package org.lg.MySpace.utils;

import java.sql.Connection;
import java.sql.SQLException;

import com.alibaba.druid.pool.DruidDataSource;

public class JDBCUtils {
	/** 数据源 */
	private static DruidDataSource dataSource;
	
	public static Connection getConn(){
		//FIXME 使用的druid连接池  目前还啥都不会  文档打不开  简单的根据api取得数据库连接  有待修改
		try {
			System.out.println("连接池连接数量:" + dataSource.getConnectCount());
			System.out.println("连接池激活数量:" + dataSource.getActiveCount());
			Connection conn = dataSource.getConnection();
			System.out.println("连接池激活数量:" + dataSource.getActiveCount());
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void closeConn(Connection conn){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setDateSource(DruidDataSource dateSource) {
		this.dataSource = dateSource;
	}
}
