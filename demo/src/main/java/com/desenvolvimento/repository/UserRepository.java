package com.desenvolvimento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.desenvolvimento.entity.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long>{
	
	public List<User> findByEmail(String email);
	public List<User> findByCompanyId(Long companyId);
	public User deleteByUserId(Long userId);
	public User findByUserId(Long id);
	public User findByEmailAndCompanyId(String email,Long companyId);

}
