package com.epam.junit;

import junit.framework.TestCase;

public class MainTest extends TestCase 
{
	Main obj=new Main();
	public void testCase1()
	{
		assertEquals("NY",obj.remove_As("AANY"));
	}
	public void testCase2()
	{
		assertEquals("BHI",obj.remove_As("ABHI"));
	}
	public void testCase3()
	{
		assertEquals("BNNED",obj.remove_As("BANNED"));
	}
	public void testCase4()
	{
		assertEquals("HELLO",obj.remove_As("HELLO"));
	}
}
