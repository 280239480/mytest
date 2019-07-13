package cn.itcast.annotation;
@MyAnno3
public class Demo1 {
    @MyAnno2(name="ezio",age=30,per=Person.P1,anno=@MyAnno3,arr={1,2})
    @MyAnno3
    public void show(){
        System.out.println("demo1...show...");
    }
}
