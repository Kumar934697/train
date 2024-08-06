class Owner
{
	String name="giri";
	int age=25;
	String gender;
	
	Owner()
	{
		
	}
	
	Owner(String gender)
	{
		this.gender=gender;
	}
	public void screen()
	{
		System.out.println("Owner Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("gender:"+this.gender);

	}
}

class Hotel
{
	String name="pavan";
	Owner owner=new Owner("male");
	
	public void screen()
	{
		System.out.println("Hotel Name:"+this.name);
		owner.screen();
	}
	
}


