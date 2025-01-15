package com.example;

public class MyRunnableMain2 {
    public static void main(String[] args){


        RunnableExecute runnableExecute = new RunnableExecute();
        System.out.println("----------");
        runnableExecute.execute(() -> {
                System.out.println("hello!!!");
            });
        System.out.println("----------");
    }
}
