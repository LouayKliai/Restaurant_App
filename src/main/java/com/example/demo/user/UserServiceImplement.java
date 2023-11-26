package com.example.demo.user;

import java.util.List;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplement implements UserService{
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void deleteUserById(int id) {
		userRepository.deleteById(id);
	}

	@Override
	public void deleteAllUser() {
		userRepository.deleteAll();
	}

	@Override
	public User findUserById(int id) {
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public User findUserByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}

	@Override
	public User findUserByLastName(String lastName) {
		return userRepository.findUserByLastName(lastName);
	}

	@Override
	public User findUserByFirstName(String firstName) {
		return userRepository.findUserByFirstName(firstName);
	}

	@Override
	public List<User> findUserByRole(Role role) {
		return userRepository.findUserByRole(role);
	}

	@Override
	public User findUserByPhone(String phone) {
		return userRepository.findUserByPhone(phone);
	}

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

}
