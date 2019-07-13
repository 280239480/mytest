package cn.itcast.junit;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//测试add方法
public class CalculatorTest {
    @Before
    public void iniy(){}
    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        int sum=c.add(1,2);
        Assert.assertEquals(1,sum);
    }
    @After
    public void close(){}
}
