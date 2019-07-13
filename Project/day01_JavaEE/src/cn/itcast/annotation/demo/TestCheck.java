package cn.itcast.annotation.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCheck {
    public static void main(String[] args) throws IOException {
        //1.获取一个Caculator的类对象
        //2.获取方法的类对象
        //3.获取到所有的方法
        //4.对所有方法进行判断，是否有注解；有则检测：出现异常，出现异常记录到文件，并记录一次；
        //5.关闭资源
        Class<Calculator> c = Calculator.class;
        Calculator cc = new Calculator();
        Method[] methods = c.getMethods();
        BufferedWriter bw=new BufferedWriter(new FileWriter("cn.itcast//bug.txt"));
        int number=0;
        for (Method method : methods) {
            if(method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(cc);
                } catch (Exception e) {
                    String classname = e.getCause().getClass().getSimpleName();
                    String message = e.getCause().getMessage();
                    String message1 = e.getCause().getMessage();
                    bw.write(method+"方法出异常了");
                    bw.newLine();
                    bw.write("异常名称："+classname);
                    bw.newLine();
                    bw.write("异常原因："+message);
//                    空指针的异常原因信息是一个null，写的时候容易发生空指针；

                    bw.newLine();
                    bw.flush();
                    number++;
                }
            }
        }
        bw.write("总共出现了"+number+"次异常");
        bw.flush();
        bw.close();

    }
}
