import java.util.Scanner;
import java.util.Arrays;
public class ex4153{
	public static void main(String[] agrs){
		Scanner s = new Scanner(System.in);
		int a[] = new int[3];
		int b[] = {0,0,0};
		int counter=0;
		for(;;){
			for(int i=0;i<3;i++){
				a[i]=s.nextInt();
				if(a[i]==0) counter++;
			}
			if(counter==3) break;
			Arrays.sort(a);
			if(a[2]*a[2]==a[1]*a[1]+a[0]*a[0]) System.out.print("right\n");
			else System.out.print("wrong\n");
		}
	}
}
