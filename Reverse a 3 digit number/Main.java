import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here    System.out.println(sum); 
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int n2=n1/100;
    int n3=(n1/10)%10;
    int n4=n1%10;
    int sum=((n4*100)+(n3*10)+(n2));
    System.out.println(sum);
    
  }
}