package com.glca.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glca.app.entity.Role;
import com.glca.app.repository.IRoleRepository;

@Service
public class RoleServiceImpl implements IRoleService {

	@Autowired
	private IRoleRepository roleRepository;

	@Override
	public Role addRole(Role role) {
		return roleRepository.save(role);
	}

}
