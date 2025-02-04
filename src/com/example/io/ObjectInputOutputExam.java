package com.example.io;

import java.io.*;
import java.util.ArrayList;

public class ObjectInputOutputExam {
    public static void main(String[] args) throws Exception {
        User user1 = new User("hyunsuddong@naver.com", "박현수", 1996);
        User user2 = new User("go@example.com", "고길동", 1995);
        User user3 = new User("d@example.com", "둘리", 1991);
        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        ArrayList<User> list2 = copy(list);

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }

    private static ArrayList<User> copy(ArrayList<User> list) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bout);
        out.writeObject(list);
        byte[] array = bout.toByteArray();

        out.close();
        bout.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(array));
        ArrayList<User> list2 = (ArrayList) in.readObject();
        in.close();
        return list2;
    }
}
