package com.roamingcloud.reviewhub.service;

import com.roamingcloud.reviewhub.dto.Result;
import com.roamingcloud.reviewhub.entity.Voucher;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IVoucherService extends IService<Voucher> {

    Result queryVoucherOfShop(Long shopId);

    void addSeckillVoucher(Voucher voucher);
}
