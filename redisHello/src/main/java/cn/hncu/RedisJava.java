package cn.hncu;

import redis.clients.jedis.Jedis;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2017/3/4.
 * Time: 下午 12:28.
 * Explain:测试RedisPool
 */
public class RedisJava {

    public static void main(String[] args) {
        RedisPool.getJedis().set("name","陈浩翔");
        System.out.println(RedisPool.getJedis().get("name"));
    }

}
