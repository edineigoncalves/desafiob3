package com.desenvolvimento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.desenvolvimento.entity.User;
import com.desenvolvimento.service.impl.UserServiceImpl;

import io.swagger.annotations.ApiOperation;

@RestController
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@GetMapping("/user/all")
	@ApiOperation(value = "Mostra todos os usuários cadastrados")
	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok().body(userService.findAll());
	}

	@PostMapping("/user/save")
	@ApiOperation(value = "Cadastro de usuário")
	public ResponseEntity<User> saveUser(@RequestBody User user) {	
		return (Optional.ofNullable(userService.findByEmailAndCompanyId(user.getEmail(),user.getCompanyId())).isPresent()) ? ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new User()): ResponseEntity.ok().body(userService.saveUser(user));
	}

	@GetMapping("/user/userId/{id}")
	@ApiOperation(value = "Consulta por Id")
	public ResponseEntity<Optional<User>> findById(@PathVariable(name = "id") Long id) {
		return ResponseEntity.ok().body(userService.findByUserId(id));
	}

	@GetMapping("/user/email/{email}")
	@ApiOperation(value = "Consulta por email")
	public ResponseEntity<List<User>> findByEmail(@PathVariable(name = "email") String email) {
		return ResponseEntity.ok().body(userService.findByEmail(email));
	}

	@GetMapping("/user/companyId/{companyId}")
	@ApiOperation(value = "Consulta por companyId")
	public ResponseEntity<List<User>> findByCompanyId(@PathVariable(name = "companyId") Long companyId) {
		return ResponseEntity.ok().body(userService.findByCompanyId(companyId));
	}

	@DeleteMapping("/user/delete/{id}")
	@ApiOperation(value = "Remover usuário")
	public ResponseEntity<User> delete(@PathVariable(name = "id") Long userId) {
		return ResponseEntity.ok().body(userService.deleteByUserId(userId));
	}

}
