package com.jonathanweb.funescalade.service;

import com.jonathanweb.funescalade.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
