package com.roamingcloud.reviewhub.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.roamingcloud.reviewhub.dto.LoginFormDTO;
import com.roamingcloud.reviewhub.dto.Result;
import com.roamingcloud.reviewhub.entity.User;

import javax.servlet.http.HttpSession;


public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();

}
