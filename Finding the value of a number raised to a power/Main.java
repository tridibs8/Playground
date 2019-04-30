
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);      //Try your logic here
      int base=in.nextInt();
      int exponent=in.nextInt();
      int power=1;
      while(exponent >=1)
      {
        power=power*base;
        exponent--;
      }
      System.out.print(power);
    }
}