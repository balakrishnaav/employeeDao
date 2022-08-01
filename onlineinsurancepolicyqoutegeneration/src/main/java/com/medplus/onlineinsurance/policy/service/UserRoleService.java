package com.medplus.onlineinsurance.policy.service;

import java.util.List;

import com.medplus.onlineinsurance.policy.beans.UserRole;

public interface UserRoleService {
	UserRole getUserByUsernam(String username);
	int addUser(UserRole user);
	List<UserRole> getUsers();
}
