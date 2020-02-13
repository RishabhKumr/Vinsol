class Frog
{
    static int frogCount = 0;
    public Frog()
    {
      frogCount+=1;
    }
    public static void main(String args[])
    {
        new Frog();
        new Frog();
        new Frog();
        System.out.println("Frog count is"+frogCount);
    }
}