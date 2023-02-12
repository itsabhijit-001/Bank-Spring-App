package org.antwalk;

import org.antwalk.account.Account;
import org.antwalk.account.Customer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Customer customer=context.getBean(Customer.class);
		customer.display();
		Account savingAccount=context.getBean("saving",Account.class);
		Account currentAccount=context.getBean("current",Account.class);
		System.out.println();
		System.out.println("This account type is :"+savingAccount.showAccount());
		System.out.println();
		System.out.println("This account type is :"+currentAccount.showAccount());
	}

}
