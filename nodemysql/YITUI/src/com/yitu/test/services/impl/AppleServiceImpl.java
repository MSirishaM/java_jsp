package com.yitu.test.services.impl;

import com.yitu.test.dao.impl.AppleDaoImpl;
import com.yitu.test.dao.virtual.AppleDao;
import com.yitu.test.pojo.Apple;
import com.yitu.test.services.virtual.AppleService;

public class AppleServiceImpl implements AppleService {

    private AppleDao appleDao = new AppleDaoImpl();
    public boolean save(Apple apple)
    {
        return appleDao.saveApple(apple);
    }
    public int getAppleCount(){
        return appleDao.getAppleCount();
    }
}
