package test.com.yitu.test.services.impl; 

import com.yitu.test.pojo.Apple;
import com.yitu.test.services.impl.AppleServiceImpl;
import com.yitu.test.services.virtual.AppleService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* AppleServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>Aug 1, 2017</pre> 
* @version 1.0 
*/ 
public class AppleServiceImplTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: save(Apple apple) 
* 
*/ 
@Test
public void testSave() throws Exception {
    Apple apple = new Apple();
    apple.setColor(1);
    apple.setWeight(1.2);
    apple.setSize(2);
    AppleService appleService = new AppleServiceImpl();
    boolean res = appleService.save(apple);
    Assert.assertEquals(true,res);
//TODO: Test goes here... 
}

public void testGetAppleCount()throws Exception{
    AppleService appleService = new AppleServiceImpl();
    int count = appleService.getAppleCount();
    Assert.assertEquals(1,count);
}


} 
