package com.medplus.onlineinsurance.policy.service;

import com.medplus.onlineinsurance.policy.beans.Accounts;

public interface AccountsService {
	int addAccount(Accounts account);

	int getMaxCount();
}
