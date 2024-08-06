class AutodriverRunner
{
public static void main(String[]args)
{
Autodriver aurodriver=new Autodriver();
System.out.println("String Autodriver in AutodriverRunner");

String personName = Autodriver.personName;
String lastname = Autodriver.lastname;
String gender = Autodriver.gender;

System.out.println("PersonName :"personName);
System.out.println("Lastname :"lastname);
System.out.println("Gender :"gender);

System.out.println("ending Autodriver in AutodriverRunner");
}
}

