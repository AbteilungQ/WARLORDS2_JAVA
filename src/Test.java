public class Test implements ITastatur
{
    private Tastatur tasten;
    
    public Test()
    {
        for(int t2 = 0;t2 < 9;t2++)
        {
            for(int t1 = 0;t1 < 9;t1++)
            {
                
                System.out.println("else if(ID == "+(200+t2*10+t1)+")");
                System.out.println("{");
                System.out.println("System.out.println(\"Behälter"+(t1+1)+"x"+(t2+1)+"\");");
                System.out.println("}");
            }
        }
    }
    public void tastenAktion(String rueckgabe)
    {
        if(rueckgabe.equals("Y"))
        {
            System.out.println("Make Henning great again");
        }
        else if(rueckgabe.equals("DOWN"))
        {
            
        }
        else if(rueckgabe.equals("LEFT"))
        {
            
        }
        else if(rueckgabe.equals("RIGHT"))
        {
            
        }
    }
}
