package com.roamingcloud.reviewhub.service;

import com.roamingcloud.reviewhub.dto.Result;
import com.roamingcloud.reviewhub.entity.Follow;
import com.baomidou.mybatisplus.extension.service.IService;


public interface IFollowService extends IService<Follow> {

    Result follow(Long followUserId, Boolean isFollow);

    Result isFollow(Long followUserId);

    Result followCommons(Long id);
}
