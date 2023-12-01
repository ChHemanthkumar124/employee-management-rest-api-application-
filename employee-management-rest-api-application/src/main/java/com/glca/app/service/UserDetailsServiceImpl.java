package com.glca.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.glca.app.entity.User;
import com.glca.app.repository.IUserRepository;
import com.glca.app.security.AppUserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private IUserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
 		User user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username " + username);
		}
		return new AppUserDetails(user);
	}

}
