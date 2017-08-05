package com.yitu.test.dao.virtual;

import com.yitu.test.pojo.Apple;

public interface AppleDao {

    public boolean saveApple(Apple apple);
    public int getAppleCount();

}
