public class Mapdata
{
    int[] [] bg; //background
    int[] [] a; //1.Truppe
    int[] [] b; //2.Truppe
    int[] [] c; //3.Truppe
    int[] [] d; //4.Truppe
    int[] [] e; //5.Truppe
    int[] [] f; //6.Truppe
    int[] [] g; //7.Truppe
    int[] [] h; //8.Truppe
    
    private int i,j; //Koordinaten
    private int z; //Vergroesserungsfaktor
    private String type;
    public Mapdata()
    {
        bg = new int[112] [157];
        a = new int[112] [157];
        b = new int[112] [157];
        c = new int[112] [157];
        d = new int[112] [157];
        e = new int[112] [157];
        f = new int[112] [157];
        g = new int[112] [157];
        h = new int[112] [157];
        
        StaticTools.setzeFarbe("hellbraun",166,85,0);
        StaticTools.setzeFarbe("braun",117,52,0);
        StaticTools.setzeFarbe("grau",113,113,113);
        StaticTools.setzeFarbe("hellgrau",146,146,146);
        StaticTools.setzeFarbe("dunkelgrau",81,81,81);
        StaticTools.setzeFarbe("orange",255,162,0);
        StaticTools.setzeFarbe("gelb",255,239,32);
        StaticTools.setzeFarbe("gruen",0,142,0);
        StaticTools.setzeFarbe("hellgruen",81,174,28);
        StaticTools.setzeFarbe("dunkelgruen",0,89,0);
        StaticTools.setzeFarbe("weiss",255,255,255);
        StaticTools.setzeFarbe("schwarz",0,0,0);
        StaticTools.setzeFarbe("hellblau",44,186,255);
        StaticTools.setzeFarbe("dunkelblau",0,93,211);
    }
    
    // public void generate_bg()
    // {
        // for(i=0;i<157;i++)
        // {
            // for(j =0;j<112;j++)
            // {
                // if(bg[j] [i] == 0) //Wasser
                // {
                    // type = "Water";
                // }
                // else if(bg[j] [i] == 1) //Gras
                // {
                    // int random = StaticTools.gibZufall(1);
                    // if(random == 0)
                    // {
                        // type = "Grass_1";
                    // }
                    // else if(random == 1)
                    // {
                        // type = "Grass_2";
                    // }
                // }
                // draw();
            // }
        // }
    // }
    
    // public void draw()
    // {
        // new Bild(j*40*z,i*40*z,40*z,40*z,"graphics/Tiles/"+type+"_x2.png");
    // }
    
    public void map1()
    {
        for(int j = 0;j < 157;j++)
        {
            for(int i = 0;i < 112;i++)
            {
                bg[i] [j] = 1;
            }
        }
    }
}