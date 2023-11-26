package com.example.demo.user;

import java.util.List;

import javax.management.relation.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findUserByEmail(String email);
	User findUserByLastName(String lastName);
	User findUserByFirstName(String firstName);
	List<User> findUserByRole(Role role);
	User findUserByPhone(String phone);
}
