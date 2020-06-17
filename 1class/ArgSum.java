public class ArgSum
{
  public static void main(String[] args)
  {
    int summation=0;
    for (int i=0; i<args.length; i++)
    {
      summation+=Integer.parseInt(args[i]);
    }
    System.out.println(summation);
  }
}
