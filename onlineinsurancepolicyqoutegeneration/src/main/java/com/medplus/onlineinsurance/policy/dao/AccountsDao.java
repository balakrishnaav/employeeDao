package com.medplus.onlineinsurance.policy.dao;

import com.medplus.onlineinsurance.policy.beans.Accounts;

public interface AccountsDao {
	int addAccount(Accounts account);

	int getMaxCount();
	

}
