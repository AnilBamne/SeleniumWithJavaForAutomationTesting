package MethodWithReturnType;

public class sample1 
{
	
	public static void main(String[] args) 
	{
		int num1=10;
		int num2=25;
		int num3=2;		
		int	num4=addition(num1, num2);   //10, 25  ==35			
		System.out.println(num4);
		
		sample1 s1=new sample1();
		int num5 = s1.multiplication(num3, num4);   //2,35  --> 70
		System.out.println(num5);		
	}
	
	
	
	//method with int return type
	public static int addition(int a, int b)    //10,25
	{
		int sum = a+b;         //10+25 ==35	
		return sum;
	}
	
	
	//method with int return type
	public int multiplication(int c, int d)   //2,35
	{
		int mult=c*d;    //2*35 = 70
		return mult;
	}
	


}
