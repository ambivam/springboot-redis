package com.springredis.springredis.service;

import com.springredis.springredis.model.User;

import java.util.List;

public interface UserService {
    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserBuId(Long id);

    boolean deleteUser(Long id);
}
