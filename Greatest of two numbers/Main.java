import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here 
      Scanner in=new Scanner(System.in);
        int Num1=in.nextInt();
      int Num2=in.nextInt();
      if(Num1>Num2)
        System.out.println("num1 is the greatest number");
      else
        System.out.println("num2 is the greatest number");
	}
}