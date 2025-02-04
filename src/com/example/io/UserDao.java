package com.example.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 파일에 List<User>정보를 저장하거나 읽어오는 기능
 */
public class UserDao {
    private String filename;
    public UserDao(String filename){
        this.filename = filename;
    }

    public void saveUsers(List<User> list){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))){
            out.writeObject(list);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<User> getUsers(){
        File file = new File(filename);
        if(!file.exists()){
            return new ArrayList<>();
        }

        List<User> list = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))){
            list = (List<User>)in.readObject();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return list;
    }

    public void updateUsers(List<User> list){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))){
            out.writeObject(list);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
