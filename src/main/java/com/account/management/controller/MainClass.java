package com.account.management.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.account.management.models.Account;

public class MainClass {
	
	public static void main(String args[]) {
		
		Account account=new Account("ABCDE", "savings", 123L);
		Account account2=new Account("ABCDEF", "savings", 123L);
		Account account3=new Account("ABCD", "checkings", 123L);
		
		List<Account> list=Arrays.asList(account2,account,account3);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		list.stream().forEach(a -> {
			if(a.getBalanceAmount()<200)a.setBalanceAmount(a.getBalanceAmount()+500);
		});
		
		System.out.println(list);
		
		List<Long> balanceAmounts=list.stream().map(a -> a.getBalanceAmount()-500).collect(Collectors.toList());
		
		System.out.println(balanceAmounts);
		
		List<Account> listnew=list.stream().map(a -> {
			
			if(a.getCategory().equalsIgnoreCase("savings")) {
				a.setBalanceAmount(a.getBalanceAmount()+1000);
			}
			return a;
			
		}).collect(Collectors.toList());
		
		System.out.println(listnew);
	}
	

}
