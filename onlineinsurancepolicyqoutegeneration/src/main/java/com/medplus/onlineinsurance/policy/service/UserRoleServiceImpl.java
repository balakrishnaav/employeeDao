package com.medplus.onlineinsurance.policy.service;

import java.util.List;

import com.medplus.onlineinsurance.policy.beans.UserRole;
import com.medplus.onlineinsurance.policy.dao.UserRoleDao;
import com.medplus.onlineinsurance.policy.dao.UserRoleDaoImpl;

public class UserRoleServiceImpl implements UserRoleService{
    UserRoleDao dao=new UserRoleDaoImpl();
	@Override
	public UserRole getUserByUsernam(String username) {
		// TODO Auto-generated method stub
		return dao.getUserByUsernam(username);
	}
	@Override
	public int addUser(UserRole user) {
		// TODO Auto-generated method stub
		return  dao.addUser( user);
	}
	@Override
	public List<UserRole> getUsers() {
		// TODO Auto-generated method stub
		return dao.getUsers();
	}

}
