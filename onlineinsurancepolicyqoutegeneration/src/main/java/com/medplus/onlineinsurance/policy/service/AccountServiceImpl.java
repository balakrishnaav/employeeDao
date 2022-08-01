package com.medplus.onlineinsurance.policy.service;

import com.medplus.onlineinsurance.policy.beans.Accounts;
import com.medplus.onlineinsurance.policy.dao.AccountsDao;
import com.medplus.onlineinsurance.policy.dao.AccountsDaoImpl;

public class AccountServiceImpl implements AccountsService{
	AccountsDao accDao=new AccountsDaoImpl();
	@Override
	public int addAccount(Accounts account) {
		// TODO Auto-generated method stub
		return  accDao.addAccount(account);
	}
	@Override
	public int getMaxCount() {
		// TODO Auto-generated method stub
		return accDao.getMaxCount();
	}

}
