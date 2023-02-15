public class MainClass
{
   /* int a = 14;
    public int getLocalNumber()
    {
        return 14;
    }

    private int class_number()
    {
        return 20;
    }
    public int getClassNumber()
    {
        return this.class_number();
    }
*/
    private void class_string()
    {
        System.out.println("Hello, world");
    }
    public void getClassString()
    {
        this.class_string();
    }
}
