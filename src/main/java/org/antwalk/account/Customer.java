package org.antwalk.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {

private String name,username,password,SSN,address,email;
private int age;
private long phone;
private float balance;

@Autowired
@Qualifier("current")
Account account;

public void display()
{
	System.out.println("This account in customer class of type :"+account.showAccount());
}

}
