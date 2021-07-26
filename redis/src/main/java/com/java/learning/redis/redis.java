package com.java.learning.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @auther xxs
 * @date 2021-07-23
 */
@Component
public class redis {

    @Autowired
    RedisTemplate redisTemplate;



}
