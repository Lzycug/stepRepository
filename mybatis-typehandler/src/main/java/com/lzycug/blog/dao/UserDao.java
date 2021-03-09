package com.lzycug.blog.dao;

import com.lzycug.blog.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: lzyCug
 * @date: 2021/3/8 11:20
 * @description: 持久层接口
 */
@Repository
public interface UserDao {
    Integer addUser(User user);

    List<User> getAllUser();
}
