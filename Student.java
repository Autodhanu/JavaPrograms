//package Logic;

public class Student {
	
	static String college="ITS";
	
	void display(int r,String n)
	{
		int rollno = r;
		String name= n;
		System.out.println(rollno+" "+name+" "+college);
	}
	void display1(int r,String n,String gen)
	{
		
		System.out.println(r+" "+n+" "+college+" "+gen);
	}
	public static void main(String[] args) {
		
       Student s1 = new Student();
       s1.display(112, "rama");
       s1.display1(112, "rama","male");
	}

}
