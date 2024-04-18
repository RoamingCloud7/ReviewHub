package com.roamingcloud.reviewhub.service;

import com.roamingcloud.reviewhub.dto.Result;
import com.roamingcloud.reviewhub.entity.VoucherOrder;
import com.baomidou.mybatisplus.extension.service.IService;


public interface IVoucherOrderService extends IService<VoucherOrder> {

    Result seckillVoucher(Long voucherId);
}
