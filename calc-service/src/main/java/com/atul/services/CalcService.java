package com.atul.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CalcService {

	@WebMethod
	public double doSum(Double n1, Double n2) {
		return n1 + n2;
	}
}