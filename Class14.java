package Java11;

interface iVolume
{
   public void showData();                      //遇到抽象類別時繼續向下到非抽象類別時繼承
   public double vol();
}
abstract class CShape implements iVolume
{
   final double PI=3.14;
   protected int x;
   protected int y;
   protected int z;
}
class CCircle extends CShape
{
   public CCircle(int a, int b, int c)
   {
      x=a;
      y=b;
      z=c;
   }
   public void showData()
   {
      System.out.println("球心: ("+x+","+y+")");
      System.out.println("半徑:"+z);
      System.out.println("球體積:"+vol());
   }
   public double vol()
   {
      double a = 4.0/3.0*PI*Math.pow(z, 3);
      return a;
   }
}
public class Class14
{
   public static void main(String args[])
   {
      CCircle cir = new CCircle(8, 6, 2);
      cir.showData();
   }
}
