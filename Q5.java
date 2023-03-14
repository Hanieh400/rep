package quera1;
import java.util.Scanner;
public class Q5 {
	public static void main(String[]args) {
		double b;int t=0,i=0;
		Scanner input = new Scanner(System.in);
	      double a = input.nextDouble();
	      int[] digit= new int[10];
		while(a>1)
		{
		b=a%10;
		t=(int) b;
		a=a/10;
		digit[i++]=t;
		
	}
		digit[i]=(int) a;
		for(int j=i-1;j>=0;j--)
		System.out.println(digit[j]);
	}
}
