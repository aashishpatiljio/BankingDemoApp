package com.dxc.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dto.UserDTO;
import com.dxc.model.User;
import com.dxc.repository.UserRepository;
import com.dxc.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserRepository repo;
	
	@Override
	public Integer saveUser(UserDTO dto) {
		User user = new User();
		user.setFirstName(dto.getFirstName());
		user.setLastName(dto.getLastName());
		user.setMobNum(dto.getMobNum());
		user.setEmail(dto.getEmail());
		user.setPassword(dto.getPassword());
		user.setCreatedTime(new Date());
		
		return repo.save(user).getAccNum();
	}

}
