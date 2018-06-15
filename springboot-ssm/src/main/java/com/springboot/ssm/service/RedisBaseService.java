package com.springboot.ssm.service;

import java.util.List;
import java.util.Set;

public interface RedisBaseService {

    boolean set(final String key, Object value);

    boolean set(final String key, Object value, Long expireTime);

    void remove(final String... keys);

    void remove(final String key);

    boolean exists(final String key);

    String get(final String key);

    Object hmGet(String key, Object hashKey);

    void lPush(String k, Object v);

    void hmSet(String key, Object hashKey, Object value);

    List<Object> lRange(String k, long l, long l1);

    void add(String key, Object value);

    Set<Object> setMembers(String key);

    void zAdd(String key, Object value, double scoure);

    Set<Object> rangeByScore(String key, double scoure, double scoure1);
}
