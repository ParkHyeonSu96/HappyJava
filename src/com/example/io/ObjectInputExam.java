package com.example.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputExam {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\user\\Desktop\\ParkHyeonSu\\practice\\user.txt"));
        User user = (User)in.readObject();
        in.close();
        System.out.println(user);
    }
}
