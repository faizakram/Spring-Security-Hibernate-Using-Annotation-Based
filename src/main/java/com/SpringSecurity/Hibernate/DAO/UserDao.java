package com.SpringSecurity.Hibernate.DAO;

import com.SpringSecurity.Hibernate.Entity.User;

public interface UserDao {

	User findByUserName(String username);

}