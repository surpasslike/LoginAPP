// IAdminService.aidl
package com.example.service;

interface IAdminService {
    String loginAdmin(String account, String password);//登录
    boolean registerUser2(String username, String account, String password);//注册
    void deleteUser(String username);//删除
    void updateUserPassword(String username, String newPassword);//改密
}
