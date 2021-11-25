public class Quelltext2
{
    private int i;
    public Quelltext2()
    {
        ausgabe();
    }
    public void ausgabe()
    {
        for(i=0;i<157;i++)
        {
            System.out.println("System.out.println(\"public void map1_\"+"+i+"+\"();\");");
            System.out.println("System.out.println(\"{\");");
            System.out.println("for(i=0;i<112;i++)");
            System.out.println("{");
            System.out.println("System.out.println(\"bg[\"+(i)+\"] ["+i+"] = 0;\");");
            System.out.println("}");
            System.out.println("System.out.println(\"}\");");
        }  
    }
}
