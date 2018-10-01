package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.demo.KFCService")
public class KFCService {
		
		@WebMethod
		public String WingZap() {
			return "δ‘θαͺθ";
		}
		
		public double calculate(@WebParam(name = "number") int number) {
			
			int sum = number%10 ;
			double num = 0  ;
			
			switch(sum) {
			case 0 : num = 0 ; break;
			case 1 : num = 1 ; break;
			case 2 : num = 2 ; break;
			case 3 : num = 3 ; break;
			case 4 : num = 4 ; break;
			case 5 : num = 5 ; break;
			case 6 : num = 6 ; break;
			case 7 : num = 7 ; break;
			case 8 : num = 8 ; break;
			case 9 : num = 9; break;
			}
			
			return num * 10 ;
		}
}
