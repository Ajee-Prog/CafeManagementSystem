package com.yusuf.cafe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yusuf.cafe.POJO.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
