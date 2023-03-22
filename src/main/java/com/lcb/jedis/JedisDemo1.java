package com.lcb.jedis;

import redis.clients.jedis.Jedis;

/**
 *
 */
public class JedisDemo1 {
    public static void main(String[] args) {
        //创建jedis对象
        Jedis jedis=new Jedis("192.168.248.132",6379);

        //测试
        System.out.println(jedis.ping());


    }
}
