public class Troops
{
    public Bild[] [] troops;
    public Troops()
    {
        troops = new Bild[9] [9];
        for(int fy = 0;fy < 9;fy++)
        {
            for(int fx = 0;fx < 9;fx++)
            {
                troops[fx] [fy] = new Bild(fx*80+32,fy*80+60,80,80,"graphics/Troops/Soldier_white.png");
                troops[fx] [fy].unsichtbarMachen();
            }
        }
    }
}
