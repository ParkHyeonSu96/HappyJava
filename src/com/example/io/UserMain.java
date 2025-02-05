package com.example.io;

import java.util.List;

public class UserMain {
    public static void main(String[] args) {
        UserUI userUI = new UserUI();
        UserDao userDao = new UserDao("C:\\Users\\hyuns\\Desktop\\ParkHyunSu\\Study\\users.txt");
        List<User> users = userDao.getUsers();
        while(true) {
            int menuId = userUI.menu();
            if(menuId == 5) {
                System.out.println("종료합니다.");
                userDao.saveUsers(users);
                break;
            }else if(menuId == 1) {
                User user = userUI.regUser();
                users.add(user);
                System.out.println("등록되었습니다.");
            }else if(menuId == 2) {
                userUI.printUserList(users);
            } else if(menuId == 3) {
                String email = userUI.inputEmail();
                int findIndex = -1;
                for(int i = 0; i < users.size(); i++){
                    User u = users.get(i);
                    if(u.getEmail().equals(email)) {
                        findIndex = i;
                        break;
                    }
                }

                if(findIndex != -1) {
                    System.out.println("test");
                    User updateUser = userUI.inputUser(email);
                    users.remove(findIndex);
                    users.add(updateUser);
                    System.out.println("수정되었습니다.");
                }else {
                    System.out.println("수정할 회원 정보가 없습니다.");
                }
            } else if(menuId == 4) {
                String email = userUI.inputEmail();
                boolean found = false;

                for(int i = 0; i < users.size(); i++){
                    if(email.equals(users.get(i).getEmail())){
                        found = true;
                        users.remove(i);
                        System.out.println("삭제되었습니다.");
                        break;
                    }
                }

                if(!found){
                    System.out.println("해당하는 이메일이 없습니다.");
                }
            }
        }
    }
}
