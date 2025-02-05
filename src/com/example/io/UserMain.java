package com.example.io;

import java.util.List;

public class UserMain {
    public static void main(String[] args) {
        UserUI userUI = new UserUI();
        UserDao userDao = new UserDao("C:\\Users\\user\\Desktop\\ParkHyeonSu\\practice\\users.txt");
        List<User> users = userDao.getUsers();
        while(true) {
            int menuId = userUI.menu();
            if(menuId == 5){
                System.out.println("종료합니다.");
                userDao.saveUsers(users);
                break;
            }else if(menuId == 1) {
                User user = userUI.regUser();
                users.add(user);
                System.out.println("등록되었습니다.");
            }else if(menuId == 2){
                userUI.printUserList(users);
            } else if(menuId == 3){
                String email = userUI.getEmail();
                System.out.println(email);
                for(int i = 0; i < users.size(); i++){
                    if(email.equals(users.get(i).getEmail())){
                        System.out.println("타니?");
                        User user = userUI.regUser();
                        users.remove(i);
                        users.add(i,user);
                        System.out.println("수정되었습니다.");
                    } else{
                        System.out.println("해당하는 이메일이 없습니다.");
                    }
                }
            }
        }
    }
}
