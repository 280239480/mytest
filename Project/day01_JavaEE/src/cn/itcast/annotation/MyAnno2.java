package cn.itcast.annotation;

import static cn.itcast.annotation.Person.P1;

public @interface MyAnno2 {
    String name();

    int age() ;

    Person per() ;

    MyAnno3 anno();
    int[] arr();
}

