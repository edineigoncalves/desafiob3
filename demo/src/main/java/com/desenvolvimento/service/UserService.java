package com.desenvolvimento.service;

import java.util.List;
import java.util.Optional;

import com.desenvolvimento.entity.User;

public interface UserService {
	
	public List<User> findAll();
	
	public User saveUser(User user);
	
	public Optional<User> findByUserId(Long id);
	
	public List<User> findByEmail(String email);
	
	public List<User> findByCompanyId(Long companyId);
	
	public User deleteByUserId(Long userId);
	
	public User findByEmailAndCompanyId(String email,Long companyId);

}
