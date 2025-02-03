package com.example.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExam {
    public static void main(String[] args) throws Exception {
        User user = new User("hyunsuddong@naver.com", "박현수",1996);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\user\\Desktop\\ParkHyeonSu\\practice\\user.txt"));
        out.writeObject(user);
        out.close();
    }
}
