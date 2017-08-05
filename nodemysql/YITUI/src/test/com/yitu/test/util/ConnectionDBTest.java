package test.com.yitu.test.util; 

import com.yitu.test.util.ConnectionDB;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.sql.Connection;

/** 
* ConnectionDB Tester. 
* 
* @author <Authors name> 
* @since <pre>Aug 1, 2017</pre> 
* @version 1.0 
*/ 
public class ConnectionDBTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getConnection() 
* 
*/ 
@Test
public void testGetConnection() throws Exception {
  Connection connection =  ConnectionDB.getConnection();
  Assert.assertNotNull(connection);
  ConnectionDB.closeAll(null,null,null,connection);
//TODO: Test goes here... 
} 

/** 
* 
* Method: executeUpdate(String sql, Object[] params) 
* 
*/ 
@Test
public void testExecuteUpdate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: excuteQuery(String sql, Object[] params) 
* 
*/ 
@Test
public void testExcuteQueryForSqlParams() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: excuteQuery(String sql, Object[] params, int outParamPos, int SqlType) 
* 
*/ 
@Test
public void testExcuteQueryForSqlParamsOutParamPosSqlType() throws Exception { 
//TODO: Test goes here... 
} 


/** 
* 
* Method: executeQueryRS(String sql, Object[] params) 
* 
*/ 
@Test
public void testExecuteQueryRS() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = ConnectionDB.getClass().getMethod("executeQueryRS", String.class, Object[].class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: closeAll() 
* 
*/ 
@Test
public void testCloseAll() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = ConnectionDB.getClass().getMethod("closeAll"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
