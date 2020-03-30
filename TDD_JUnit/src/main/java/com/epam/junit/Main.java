package com.epam.junit;

public class Main {
	public String remove_As(String s)
	{
		String s1=null;
		if(s.charAt(0)=='A' && s.charAt(1)=='A')
		{
			s1=s.substring(2,s.length());
		}
		else if(s.charAt(0)=='A')
		{
			s1=s.substring(1,s.length());
		}
		else if(s.charAt(1)=='A')
		{
			s1=s.charAt(0)+s.substring(2,s.length());
		}
		else
		{
			s1=s;
		}
		return s1;
	}
}

