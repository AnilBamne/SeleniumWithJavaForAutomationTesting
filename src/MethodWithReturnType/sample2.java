package MethodWithReturnType;

public class sample2 
{
	
	//method with String return type
		public static String convertNameToCaps(String s1)
		{
			String s2 = s1.toUpperCase();
			return s2;
		}
		

		public static void main(String[] args) {
			
			
			String s3 = convertNameToCaps("mayur");
			System.out.println(s3);         //MAYUR
			
			System.out.println("----");
			System.out.println(convertNameToCaps("nilesh"));  //NILESH
			
			
			System.out.println("----------------------------------------");
			
			int length = sample3.findLengthOfString("xyz");
			System.out.println(length);
			
			System.out.println("----");
			
			System.out.println(sample3.findLengthOfString("abcd"));
					
		}


}
