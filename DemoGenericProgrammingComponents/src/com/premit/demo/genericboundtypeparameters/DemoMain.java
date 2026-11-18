package com.premit.demo.genericboundtypeparameters;

public class DemoMain {
	public static void main(String[] args) {
		//BoundedTypeParamters : To restrict other datatypes.
		Display<Integer> display = new Display<>(); //Accepts only Number(PClass) and CClasses(Byte,Short,Integer,Long,Float,Double,Character,Boolean)
		display.setValue(100);
		int result  = display.getValue();
		System.out.println("result : "+result);
		
		
		//Display<String> display2 = new Display<String>(); //String is restricted, shows compile time error.
		
		
		//Method accepts only Number types.
		Calculation.add(100, 100);
		
		//Calculation.add("Ram", "Raj"); //Shows compile time error.
	}
}
