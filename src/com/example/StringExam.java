package com.example;

public class StringExam {
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        if(str1 == str2)
            System.out.println("str1 == str2");
        if(str1 == str3)
            System.out.println("str1 == str3");
        if(str3 == str4)
            System.out.println("str3 == str4");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);


    }
}
