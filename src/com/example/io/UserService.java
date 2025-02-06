package com.example.io;

import java.util.List;

public interface UserService {
    // 회원정보를 등록한다.
    public void addUser(User user);
    // 회원정보를 수정한다. user.getEmail()에 해당하는 회원정보를 수정한다.
    public void updateUser(User user);
    // 회원정보를 삭제한다.
    public void deleteUser(String email);
    // 모든 회원정보를 반환한다.
    public List<User> getUsers();
}
