package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

//	fake user list

	List<User> list = List.of(new User(1311L, "Akash Kumar", "7299456223"),
			new User(1312L, "Ashish Kumar", "7299456014"), new User(1314L, "ajay Kumar", "9080630745"));

	@Override
	public User getUser(Long id) {
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
