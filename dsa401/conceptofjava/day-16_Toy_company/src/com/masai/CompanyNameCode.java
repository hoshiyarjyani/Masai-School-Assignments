package com.masai;

import java.util.Map;
import java.util.TreeMap;

public final class CompanyNameCode {
   public static final Map<String,String> companyCode;
   static {
	   companyCode= new TreeMap<>();
	   companyCode.put("EKP", "Ekoplay");
	   companyCode.put("EXP", "Explore");
	   companyCode.put("FSK", "Funskool");
	   companyCode.put("NKT", "Natkhat");
	   companyCode.put("SLD", "Sunlord");
	   companyCode.put("TZN", "ToyZone");
   }
  
   
   
}
