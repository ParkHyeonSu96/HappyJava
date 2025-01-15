package com.example;

import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String args[]) throws Exception{
       // a() 메소드를 가지고 있는 클랙스가 있다.
       // 이 클래스이름이 아직 무엇인지 모르겠다.
       // 나중에 이 클래스 이름을 알려주겠다.
       // a() 메소드를 실행할 수 있도록 코드를 작성해라.

       // Bus b = new Bus();
       // b.a();

       // className에 해당하는 클래스를 찾아서 클래스 정보를 CLASSPATH에서 읽어들이고,
       // 그 정보를 clazz가 참조하도록 한다.
       // Object o = new Bus();
       // Car c = new Bus();
       String className = "com.example.Bus";
       Class clazz = Class.forName(className);
       Object o = clazz.newInstance();

       Method m = clazz.getDeclaredMethod("a", null); // a() 메소드 정보를 가지고 있는 Method를 반환하라.
       m.invoke(o, null); // Object o가 참조하는 객체의 m 메소드를 실행하라.




    }
}
