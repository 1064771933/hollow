import java.util.Scanner;
public class Xuanzejisuanqi{
	public static void main(String[] args){
		int jia,jian,cheng,chu;
		System.out.println("����2����");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		jia=a+b;
		jian=a-b;
		cheng=a*b;
		chu=a/b;
		System.out.println("����Ҫ����ķ�ʽ,1Ϊ�ˣ�2Ϊ����3Ϊ�ˣ�4Ϊ����");
		Scanner f= new Scanner(System.in);
		int c=f.nextInt();
		switch(c){
			case 1: System.out.println("��Ϊ"+jia);break;
			case 2: System.out.println("��Ϊ"+jian);break;
			case 3: System.out.println("��Ϊ"+cheng);break;
			case 4: System.out.println("��Ϊ"+chu);break;
		}
		
		
	}
}
