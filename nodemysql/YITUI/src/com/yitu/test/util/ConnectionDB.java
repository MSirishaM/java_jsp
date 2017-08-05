package com.yitu.test.util;



import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * 数据库连接类
 * 说明:封装了 无参，有参，存储过程的调用
 * @author iflytek
 *
 */
public class ConnectionDB {

    /**
     * 数据库驱动类名称
     */
    private static  String DRIVER = null;

    /**
     * 连接字符串
     */
    private static  String URLSTR = null;

    /**
     * 用户名
     */
    private static  String USERNAME = null;

    /**
     * 密码
     */
    private static  String USERPASSWORD = null;



    /**
     * 创建结果集对象
     */
    private ResultSet resultSet = null;

    static {
        InputStream input = null;
        try {
            input = Class.forName("com.yitu.test.util.ConnectionDB").getResourceAsStream("/resources/jdbc.properties");
            Properties properties = new Properties();
            properties.load(input);
            DRIVER=properties.getProperty("DRIVER");
            URLSTR=properties.getProperty("URL");
            USERNAME=properties.getProperty("USERNAME");
            USERPASSWORD=properties.getProperty("PASSWORD");
            // 加载数据库驱动程序
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("加载驱动错误");
            System.out.println(e.getMessage());
        }catch (IOException e)
        {   System.out.println("读取配置文件错误");
            System.out.println(e.getMessage());
        }
    }

    /**
     * 建立数据库连接
     * @return 数据库连接
     */
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // 获取连接
            connection = DriverManager.getConnection(URLSTR, USERNAME,
                    USERPASSWORD);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }



    /**
     * 关闭所有资源
     */
    public static void closeAll(ResultSet resultSet,PreparedStatement preparedStatement,CallableStatement callableStatement,Connection connection) {
        // 关闭结果集对象
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        // 关闭PreparedStatement对象
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        // 关闭CallableStatement 对象
        if (callableStatement != null) {
            try {
                callableStatement.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        // 关闭Connection 对象
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}