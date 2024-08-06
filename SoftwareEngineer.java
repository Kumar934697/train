class SoftwareEngineer
{
	String name="Naga";
	int experience=5;
	String designation="Front end developer";
	double salary;
	
	public void show()
	{
		System.out.println("Engineer Name:"+this.name);
		System.out.println("Experience:"+this.experience);
		System.out.println("Designation:"+this.designation);
		System.out.println("Salary:"+this.salary);

	}
	SoftwareEngineer(double salary)
	{
	     this.salary=salary;	
	}
	
}


class Company
{
	int id=934697;
	String name="wizgrad";
	String location;
	SoftwareEngineer softwareEngineer=new SoftwareEngineer(60000);
	
	Company(String location)
	{
		this.location=location;
	}
	
	public void show()
	{
		System.out.println("company id:"+this.id);
		System.out.println("company name:"+this.name);
		System.out.println("company location:"+this.location);
		softwareEngineer.show();	
	}
	
	
}


