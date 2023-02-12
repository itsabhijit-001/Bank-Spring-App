package org.antwalk.account;

import org.springframework.stereotype.Component;

@Component("saving")
public class Saving implements Account{

	@Override
	public String showAccount() {
		// TODO Auto-generated method stub
		return "Saving";
	}

}
