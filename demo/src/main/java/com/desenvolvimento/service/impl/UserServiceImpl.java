package com.desenvolvimento.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desenvolvimento.entity.User;
import com.desenvolvimento.repository.UserRepository;
import com.desenvolvimento.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public Optional<User> findByUserId(Long id) {
		return Optional.ofNullable(userRepository.findByUserId(id));
	}

	@Override
	public List<User> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public List<User> findByCompanyId(Long companyId) {
		return userRepository.findByCompanyId(companyId);
	}

	@Override
	public User deleteByUserId(Long userId) {
		return userRepository.deleteByUserId(userId);
	}

	@Override
	public User findByEmailAndCompanyId(String email, Long companyId) {
		return userRepository.findByEmailAndCompanyId(email, companyId);
	}

}
