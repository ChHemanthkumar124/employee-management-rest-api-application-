package com.glca.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.glca.app.entity.User;
import com.glca.app.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;

	@Autowired
	private IUserRepository userRepository;

	@Override
	public User addUser(User user) {
		user.setPassword(bcryptEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

}
