import java.util.Scanner;
public class Xuanzejisuanqi{
	public static void main(String[] args){
		int jia,jian,cheng,chu;
		System.out.println("输入2个数");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		jia=a+b;
		jian=a-b;
		cheng=a*b;
		chu=a/b;
		System.out.println("输入要计算的方式,1为乘，2为减，3为乘，4为除。");
		Scanner f= new Scanner(System.in);
		int c=f.nextInt();
		switch(c){
			case 1: System.out.println("加为"+jia);break;
			case 2: System.out.println("减为"+jian);break;
			case 3: System.out.println("乘为"+cheng);break;
			case 4: System.out.println("除为"+chu);break;
		}
		
		
	}
}
