package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.demo.KFCService")
public class KFCService {
		
		@WebMethod
		public String WingZap() {
			return "ä¡èáªè¹éÓ";
		}
}
