package com.yitu.test.dao.impl;

import com.yitu.test.dao.virtual.AppleDao;
import com.yitu.test.pojo.Apple;
import com.yitu.test.util.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AppleDaoImpl implements AppleDao {
    @Override
    public boolean saveApple(Apple apple)
    {
        boolean res = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "insert into apple(size,weight,colour)values(?,?,?)";
        int count = 0;
        try
        {
            connection = ConnectionDB.getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,apple.getSize());
            preparedStatement.setDouble(2,apple.getWeight());
            preparedStatement.setInt(3,apple.getColor());
            preparedStatement.executeUpdate();
            connection.commit();
            count = preparedStatement.getUpdateCount();
            if(count > 0)
            {
                res = true;
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("插入一个苹果出错，这个苹果的size:" + apple.getSize()+"  weight:"+apple.getWeight()+"   color:" + apple.getColor());
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {

            ConnectionDB.closeAll(null,null,null,connection);
        }

        return res;
    }

    @Override
    public int getAppleCount()
    {
        int count = 0;
        //your code write here


        return count;
    }

}
