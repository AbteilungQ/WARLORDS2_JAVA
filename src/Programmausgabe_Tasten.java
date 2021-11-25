public class Programmausgabe_Tasten implements ITuWas
{
    private String color;
    private Taste hellgruen;
    private Taste gruen;
    private Taste dunkelgruen;
    private Taste rot;
    private Taste gelb;
    private Taste orange;
    private Taste hellgrau;
    private Taste grau;
    private Taste dunkelgrau;
    private Taste weiss;
    private Taste schwarz;
    private Taste hellblau;
    private Taste dunkelblau;
    private Taste hellbraun;
    private Taste braun;
    private String farbe;
    private int i;
    public Programmausgabe_Tasten()
    {
        hellgruen = new Taste("hellgruen",1,1,150,50);
        gruen = new Taste("gruen",151,1,150,50);
        dunkelgruen = new Taste("dunkelgruen",301,1,150,50);
        rot = new Taste("rot",1,51,150,50);
        gelb = new Taste("gelb",151,51,150,50);
        orange = new Taste("orange",301,51,150,50);
        hellgrau = new Taste("hellgrau",1,101,150,50);
        grau = new Taste("grau",151,101,150,50);
        dunkelgrau = new Taste("dunkelgrau",301,101,150,50);
        weiss = new Taste("weiss",1,151,150,50);
        schwarz = new Taste("schwarz",151,151,150,50);
        hellblau = new Taste("hellblau",301,151,150,50);
        dunkelblau = new Taste("dunkelblau",1,201,150,50);
        braun = new Taste("braun",151,201,150,50);
        hellbraun = new Taste("hellbraun",301,201,150,50);
        
        hellgruen.setzeLink(this,1);
        gruen.setzeLink(this,2);
        dunkelgruen.setzeLink(this,3);
        rot.setzeLink(this,4);
        gelb.setzeLink(this,5);
        orange.setzeLink(this,6);
        hellgrau.setzeLink(this,7);
        grau.setzeLink(this,8);
        dunkelgrau.setzeLink(this,9);
        weiss.setzeLink(this,10);
        schwarz.setzeLink(this,11);
        hellblau.setzeLink(this,12);
        dunkelblau.setzeLink(this,13);
        braun.setzeLink(this,14);
        hellbraun.setzeLink(this,15);
        
        int i=-1;
    }
    public void tuWas(int ID)
    {
        if(ID == 1)
        {
            farbe="\"hellgruen\"";
            ausgabe();
            i++;
        }
        if(ID == 2)
        {
            farbe="\"gruen\"";
            ausgabe();
            i++;
        }
        if(ID == 3)
        {
            farbe="\"dunkelgruen\"";
            ausgabe();
            i++;
        }
        if(ID == 4)
        {
            farbe="\"rot\"";
            ausgabe();
            i++;
        }
        if(ID == 5)
        {
            farbe="\"gelb\"";
            ausgabe();
            i++;
        }
        if(ID == 6)
        {
            farbe="\"orange\"";
            ausgabe();
            i++;
        }
        if(ID == 7)
        {
            farbe="\"hellgrau\"";
            ausgabe();
            i++;
        }
        if(ID == 8)
        {
            farbe="\"grau\"";
            ausgabe();
            i++;
        }
        if(ID == 9)
        {
            farbe="\"dunkelgrau\"";
            ausgabe();
            i++;
        }
        if(ID == 10)
        {
            farbe="\"weiss\"";
            ausgabe();
            i++;
        }
        if(ID == 11)
        {
            farbe="\"schwarz\"";
            ausgabe();
            i++;
        }
        if(ID == 12)
        {
            farbe="\"hellblau\"";
            ausgabe();
            i++;
        }
        if(ID == 13)
        {
            farbe="\"dunkelblau\"";
            ausgabe();
            i++;
        }
        if(ID == 14)
        {
            farbe="\"braun\"";
            ausgabe();
            i++;
        }
        if(ID == 15)
        {
            farbe="\"hellbraun\"";
            ausgabe();
            i++;
        }
        
    }
    public void ausgabe()
    {
            if(i<40)
            {
                System.out.println("pix"+(i+1)+"x1.setzeFarbe("+farbe+");");
            }
            else if(i<80)
            {
               
                System.out.println("pix"+(i-39)+"x2.setzeFarbe("+farbe+");");
            }
            else if(i<120)
            {
            
                System.out.println("pix"+(i-79)+"x3.setzeFarbe("+farbe+");");
            }
            else if(i<160)
            {
              
                System.out.println("pix"+(i-119)+"x4.setzeFarbe("+farbe+");");
            }
            else if(i<200)
            {
               
                System.out.println("pix"+(i-159)+"x5.setzeFarbe("+farbe+");");
            }
            else if(i<240)
            {
            
                System.out.println("pix"+(i-199)+"x6.setzeFarbe("+farbe+");");
            }
            else if(i<280)
            {

                System.out.println("pix"+(i-239)+"x7.setzeFarbe("+farbe+");");
            }
            else if(i<320)
            {
                
                System.out.println("pix"+(i-279)+"x8.setzeFarbe("+farbe+");");
            }
            else if(i<360)
            {
                
                System.out.println("pix"+(i-319)+"x9.setzeFarbe("+farbe+");");
            }
            else if(i<400)
            {
               
                System.out.println("pix"+(i-359)+"x10.setzeFarbe("+farbe+");");
            }
            else if(i<440)
            {
               
                System.out.println("pix"+(i-399)+"x11.setzeFarbe("+farbe+");");
            }
            else if(i<480)
            {
                System.out.println("pix"+(i-439)+"x12.setzeFarbe("+farbe+");");
            }
            else if(i<520)
            {
                System.out.println("pix"+(i-479)+"x13.setzeFarbe("+farbe+");");
            }
            else if(i<560)
            {
                System.out.println("pix"+(i-519)+"x14.setzeFarbe("+farbe+");");
            }
            else if(i<600)
            {
                System.out.println("pix"+(i-559)+"x15.setzeFarbe("+farbe+");");
            }
            else if(i<640)
            {
                System.out.println("pix"+(i-599)+"x16.setzeFarbe("+farbe+");");
            }
            else if(i<680)
            {
                System.out.println("pix"+(i-639)+"x17.setzeFarbe("+farbe+");");
            }
            else if(i<720)
            {
                System.out.println("pix"+(i-679)+"x18.setzeFarbe("+farbe+");");
            }
            else if(i<760)
            {
                System.out.println("pix"+(i-719)+"x19.setzeFarbe("+farbe+");");
            }
            else if(i<800)
            {
                System.out.println("pix"+(i-759)+"x20.setzeFarbe("+farbe+");");
            }
            else if(i<840)
            {
                System.out.println("pix"+(i-799)+"x21.setzeFarbe("+farbe+");");
            }
            else if(i<880)
            {
                System.out.println("pix"+(i-839)+"x22.setzeFarbe("+farbe+");");
            }
            else if(i<920)
            {
                System.out.println("pix"+(i-879)+"x23.setzeFarbe("+farbe+");");
            }
            else if(i<960)
            {
                System.out.println("pix"+(i-919)+"x24.setzeFarbe("+farbe+");");
            }
            else if(i<1000)
            {
                System.out.println("pix"+(i-959)+"x25.setzeFarbe("+farbe+");");
            }
            else if(i<1040)
            {
                System.out.println("pix"+(i-999)+"x26.setzeFarbe("+farbe+");");
            }
            else if(i<1080)
            {
                System.out.println("pix"+(i-1039)+"x27.setzeFarbe("+farbe+");");
            }
            else if(i<1120)
            {
                System.out.println("pix"+(i-1079)+"x28.setzeFarbe("+farbe+");");
            }
            else if(i<1160)
            {
                System.out.println("pix"+(i-1119)+"x29.setzeFarbe("+farbe+");");
            }
            else if(i<1200)
            {
                System.out.println("pix"+(i-1159)+"x30.setzeFarbe("+farbe+");");
            }
            else if(i<1240)
            {
                System.out.println("pix"+(i-1199)+"x31.setzeFarbe("+farbe+");");
            }
            else if(i<1280)
            {
                System.out.println("pix"+(i-1239)+"x32.setzeFarbe("+farbe+");");
            }
            else if(i<1320)
            {
                System.out.println("pix"+(i-1279)+"x33.setzeFarbe("+farbe+");");
            }
            else if(i<1360)
            {
                System.out.println("pix"+(i-1319)+"x34.setzeFarbe("+farbe+");");
            }
            else if(i<1400)
            {
                System.out.println("pix"+(i-1359)+"x35.setzeFarbe("+farbe+");");
            }
            else if(i<1440)
            {
                System.out.println("pix"+(i-1399)+"x36.setzeFarbe("+farbe+");");
            }
            else if(i<1480)
            {
                System.out.println("pix"+(i-1439)+"x37.setzeFarbe("+farbe+");");
            }
            else if(i<1520)
            {
                System.out.println("pix"+(i-1479)+"x38.setzeFarbe("+farbe+");");
            }
            else if(i<1560)
            {
                System.out.println("pix"+(i-1519)+"x39.setzeFarbe("+farbe+");");
            }
            else if(i<1600)
            {
                System.out.println("pix"+(i-1559)+"x40.setzeFarbe("+farbe+");");
            }
            
    }
}
