package com.roamingcloud.reviewhub.service.impl;

import com.roamingcloud.reviewhub.entity.BlogComments;
import com.roamingcloud.reviewhub.mapper.BlogCommentsMapper;
import com.roamingcloud.reviewhub.service.IBlogCommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
