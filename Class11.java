package Java11;
interface Data
{
   public void showData(String a, String b);
}
interface Test
{
   public void showScore(int c, int d, int e);
   public double calcu();
}

class CStu implements Data, Test
{
   public CStu(String a, String b, int c, int d, int e)
   {
      showData(a, b);
      showScore(c, d, e);
      calcu();
   }

   protected String id;
   protected String name;
   protected int mid;
   protected int finl;
   protected int common;

   public void showData(String a, String b)
   {
      id = a;
      name = b;
   }
   public void showScore(int c, int d, int e)
   {
      mid = c;
      finl = d;
      common = e;
   }
   public double calcu()
   {
      double test = mid*0.3+finl*0.3+common*0.4;
      return test;
   }
   public void show()
   {
      System.out.println("id="+id+", name="+name+", mid="+mid+", finl="+finl+", common="+common+", 學期成績="+calcu());
   }
}
public class Class11
{
   public static void main(String args[])
   {
      CStu stu = new CStu("940001", "Fiona", 90, 92, 85);
      stu.show();
   }
}
