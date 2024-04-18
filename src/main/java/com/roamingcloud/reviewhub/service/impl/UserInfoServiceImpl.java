package com.roamingcloud.reviewhub.service.impl;

import com.roamingcloud.reviewhub.entity.UserInfo;
import com.roamingcloud.reviewhub.mapper.UserInfoMapper;
import com.roamingcloud.reviewhub.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
