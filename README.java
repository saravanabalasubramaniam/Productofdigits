import java.util.*;
import java.io.*;
class Productofdigits 
{
  public static void main(String args[])
  {
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
	String b=Integer.toString(a);
	char ch[]=b.toCharArray();
	int number=1;
	for(int i=0;i<b.length();i++)
	{
	 number =number* Integer.parseInt(String.valueOf(ch[i]));
	}
	System.out.println(number);
}}
