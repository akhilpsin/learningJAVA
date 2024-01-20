package com.akhil.core.InheritanceTest;

public class Phone 
{
	void on()
	{
		
		System.out.println("Phone is ON");
		
	}
	
	void Off()
	{
		
		System.out.println("Phone is OFF");
		
	}
}

class IosPhone extends Phone
{
	void Update()
	{
		
		System.out.println("IOS Updating..");
		
	}
	
	void AppStore()
	{
		
		System.out.println("APP store opening...");
		
	}
}

class AndroidPhone extends Phone
{
	void Update()
	{
		
		System.out.println("Android Updating..");
		
	}
	
	void AppStore()
	{
		
		System.out.println("Google Play store opening...");
		
	}
}
