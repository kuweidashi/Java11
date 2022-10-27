package Java10;
abstract class Math
{
   protected static int ans;

   public static void show()   
   {
      System.out.println("ans="+ans);
   }
   public abstract void add(int a, int b);
   public abstract void sub(int a, int b);
   public abstract void mul(int a, int b);
   public abstract void div(int a, int b);
}
class Compute extends Math
{

   public void add(int a, int b)
   {
      ans = a+b;
   }
   public void sub(int a, int b)
   {
      ans = a-b;
   }
   public void mul(int a, int b)
   {
      ans = a*b;
   }
   public void div(int a, int b)
   {
      ans = a/b;
   }
}
public class Class03
{
   public static void main(String args[])
   {
      Compute cmp = new Compute();
      cmp.mul(3,5);
      Math.show();      
   }
}
