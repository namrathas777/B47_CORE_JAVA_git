package com.tnsInheritance;
import com.tnsInheritance.India;
import com.tnsInheritance.kerala;

class India
{
	protected String lang = "Hindi";
	void displayNationalIndia() {
		System.out.println("National lang"+lang);
	}
	
}
class kerala extends India
{
	public String lang="Malayalam";
	void displayLocalKerala() {
		System.out.println("Local lang of Kerala "+lang);
    }
}
public class Karnataka extends kerala
{
	public String lang="Kannada";
	void displayLocalKarnataka() 
	{
		System.out.println("Local lang"+lang);
	}
}
