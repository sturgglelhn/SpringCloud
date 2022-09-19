package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule
{
    @Bean
    public IRule myRule()
    {
        /*return new RandomRule();*/  //定义为随机
        return new WeightedResponseTimeRule(); //选择权重越大，越容易被选择
    }
}
