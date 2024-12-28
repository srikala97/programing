package javaPrograms;

public class Encapsulation {

	
	public String name;
	int age;
	 
	public Encapsulation(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void SetName(String name)
	{
		this.name=name;
	}
	
	public String getName() {
		
		return name;

	}
	
	public void Setage(int age)
	{
		if(age>0)
		{
			this.age=age;
		}
		else
		{
			System.out.println(" Age cannot be negative or Zero....");
		}
	}
	
	
	public int getage()
	{
		return age;
	}
	
	
}




