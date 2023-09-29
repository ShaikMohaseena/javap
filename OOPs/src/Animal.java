
public class Animal {
	String color;
	int age;
	void initObject(String c,int a)
	{
		 color=c;
		 age=a;
	}
	void display()
	{
		System.out.println( "buzo color is : "+color);
		System.out.println( "buzo age is:"+age);
	}

	public static void main(String[] args)
	{
         Animal buzo=new Animal();
         buzo.initObject("Black", 12);
         buzo.display();
	}

}
