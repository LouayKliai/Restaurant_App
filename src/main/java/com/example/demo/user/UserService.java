package com.example.demo.user;

import java.util.List;

import javax.management.relation.Role;

public interface UserService {
	void deleteUserById(int id);
	void deleteAllUser();
	User findUserById(int id);
	User findUserByEmail(String email);
	User findUserByLastName(String lastName);
	User findUserByFirstName(String firstName);
	List<User> findUserByRole(Role role);
	User findUserByPhone(String phone);
	User createUser(User user);
}
