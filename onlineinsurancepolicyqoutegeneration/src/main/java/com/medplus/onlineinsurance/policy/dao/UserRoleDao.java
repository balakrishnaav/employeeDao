package com.medplus.onlineinsurance.policy.dao;

import java.util.List;

import com.medplus.onlineinsurance.policy.beans.UserRole;

public interface UserRoleDao {
	UserRole getUserByUsernam(String username);
	int addUser(UserRole user);
	List<UserRole> getUsers();

}
