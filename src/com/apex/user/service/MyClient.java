package com.apex.user.service;

import java.rmi.RemoteException;

import com.apex.user.service.vo.Employee;

public class MyClient {
	public static void main(String[] args) throws RemoteException {
		UserServiceProxy proxy = new UserServiceProxy();
		
		proxy.add(3, 4);
		Employee emp = proxy.getEmployee(1);
		System.out.println(emp.getCity());
	}
}
