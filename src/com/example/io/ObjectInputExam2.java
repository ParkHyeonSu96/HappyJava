package com.example.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectInputExam2 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\user\\Desktop\\ParkHyeonSu\\practice\\userlist.txt"));
        ArrayList<User> list = (ArrayList)in.readObject();
        in.close();
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
