/*
 Написать приложение для ввода пароля из командной строки и
сравнения его со строкой-образцом.*/

import java.io.*;

public class PassToSring {
	public static void main(String[] args)  {
		
	String sample;
	
	sample = "firstpass";
	
	String pass  = new String();	 
		
			
	BufferedReader kr = new BufferedReader (new InputStreamReader(System.in));
	
	System.out.println ("Enter pass:  ");
	try {
		pass = kr.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		

	// TODO Make normal inerface
	
	// boolean res = pass.equals(sample);
	
     //  if (res = false) System.out.println("Pass wrong");
     //  else System.out.println("Pass correct");
      
	 System.out.println("значения пароля: " + pass.equals(sample)); 
			
		
	
	}


}
