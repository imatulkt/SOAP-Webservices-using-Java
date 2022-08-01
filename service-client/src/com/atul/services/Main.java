package com.atul.services;

import java.rmi.RemoteException;

public class Main {
	public static void main(String[] args)
	{
		/*
		CalcService service = new CalcServiceProxy();
		try {
			double ans = service.doSum(22.20, 12.80);
			System.out.println("Answer is "+ans);
		}catch(RemoteException e) {
			e.printStackTrace();
		}
		*/
		ProductService service = new ProductServiceProxy();
		Product p1 = new Product("Sample Product", "Product Y", 2300D);
		try {
			String msg = service.create(p1);
			System.out.println(msg);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
