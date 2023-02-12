package org.antwalk.account;

import org.springframework.stereotype.Component;

@Component("current")
public class Current implements Account{

	@Override
	public String showAccount() {
		// TODO Auto-generated method stub
		return "Current";
	}

}
