package com.atguigu.springcloud.alibaba.myhandle;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(4444,"按客户自定义,global",new Payment(2020L,"serial002"));
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义,global",new Payment(2020L,"serial002"));
    }
}

