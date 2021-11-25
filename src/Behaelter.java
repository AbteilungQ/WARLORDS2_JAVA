//%$JGUIToolbox$%//

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JPanel;


/**
 * <h1>Behaelter als Container-Klasse</h1>.<br />
 * Der Behaelter nimmt GUI-Elemente auf <br />
 *
 * Diese werden relativ zum Container positioniert.<br />
 * Ein Verschieben des Behaelters verschiebt <b>alle Elemente</b> im Behaelter mit.<br />
 * <br />
 * Die Klasse kapselt die GUI-Darstellung der Elemente. <br />
 * Sie ist in einer "normalen" Java-Klasse die Erg&auml;nzung,
 * in der die <b>Graphische Darstellung</b> der Objekte gekapselt ist.
 *
 * @author Hans Witt
 *
 * @version
 * Version: 4.0
 * Zoom fuer Behaelter eingefuehrt<br />
 * Anpassung bei BasisComponente fuer Wechseln zwischen Behaeltern<br />
 * Interface IComponente. Alle Klassen, die zum einem Behaelter nachtraeglich hinzugefuegt werden koennen,
 * muessen das Interface Componente haben<br />
 * 
 */
public class Behaelter implements IContainer, IComponente {
    protected CBehaelter obj;
    protected int breite = 0;
    protected int hoehe = 0;
    protected int xPos = 0;
    protected int yPos = 0;
    protected boolean sichtbar = true;
    protected double zoomInhalt = 1;
    protected String anzeigeText = "Anzeige";
    protected int fontGroesse = -1;
    protected String farbe = "schwarz";
    protected String hintergrundFarbe = null;

    /**
     * Konstuktor fuer Hauptfenster
     */
    public Behaelter() {
        this(Zeichnung.gibZeichenflaeche());
    }

    /**
     * Konstruktor fuer Hauptfenster
     *
     * @param neueBreite
     * @param neueHoehe
     */
    public Behaelter(int neueBreite, int neueHoehe) {
        this(Zeichnung.gibZeichenflaeche(), 0, 0, neueBreite, neueHoehe);
    }

    /**
     * Konstruktor fuer Hauptfenster
     *
     * @param neuesX
     * @param neuesY
     * @param neueBreite
     * @param neueHoehe
     */
    public Behaelter(int neuesX, int neuesY, int neueBreite, int neueHoehe) {
        this(Zeichnung.gibZeichenflaeche(), neuesX, neuesY, neueBreite,
            neueHoehe);
    }

    /**
     * Konstruktor
     *
     * @param behaelter
     */
    public Behaelter(IContainer behaelter) {
        this(behaelter, 0, 0, 100, 50);
    }

    /**
     * allgemeiner Konstuktor
     *
     * @param behaelter
     * @param neueBreite
     * @param neueHoehe
     */
    public Behaelter(IContainer behaelter, int neuesX, int neuesY,
        int neueBreite, int neueHoehe) {
        obj = new CBehaelter();
        behaelter.add(obj, 0);
        setzeDimensionen(neuesX, neuesY, neueBreite, neueHoehe);
        behaelter.validate();
    }

    @Override
	public double setzeZoomfaktor(double zf) {
        zoomInhalt = obj.setzeZoomfaktor(zf);
        return zoomInhalt;
    }

    @Override
	public double getBehaelterZoom() {
        return obj.getBehaelterZoom();
    }

    public void hinzufuegen(IComponente comp) {
        comp.getBasisComponente().ausContainerEntfernen();
        obj.add(comp.getBasisComponente(), 0);
    }

    public void hinzufuegenUndAnpassen(IComponente comp) {
        comp.getBasisComponente().ausContainerEntfernen();
        obj.add(comp.getBasisComponente(), 0);
        comp.getBasisComponente().verschieben(-xPos, -yPos);
    }

    public void setzeBeschreibungstext(String neuerText) {
        anzeigeText = neuerText;
        obj.setText(anzeigeText);
    }

	public void setzeSchriftName(String name) {
		obj.setzeFontName(name);
	}

    public void setzeSchriftgroesse(int neueFontgroesse) {
        fontGroesse = neueFontgroesse;
        obj.setzeSchriftgroesse(fontGroesse);
    }
    
	public void setzeSchriftStilNormal() {
		obj.setzeSchriftStil(Font.PLAIN);
	}
	
	public void setzeSchriftStilFett() {
		obj.setzeSchriftStil(Font.BOLD);
	}
	
	public void setzeSchriftStilKursiv() {
		obj.setzeSchriftStil(Font.ITALIC);
	}


    public void setzeFarbe(String neueFarbe) {
        farbe = neueFarbe;
        obj.setzeSchriftFarbe(farbe);
    }

    public void setzeHintergrundfarbe(String neueFarbe) {
        hintergrundFarbe = neueFarbe;
        obj.setzeHintergrundfarbe(hintergrundFarbe);
    }

    public void setzeMitRand(boolean mitRand) {
        obj.setzeMitRand(mitRand);
    }

    /**
     * Das Interface IComponente fordert eine Methode die eine BasisComponente
     * zurueckliefert. Sie wird benoetigt, um ein Objekt zu einem anderen Behaelter
     * hinzuzufuegen
     */
    @Override
	public BasisComponente getBasisComponente() {
        return obj;
    }

    /**
     * Groesse des Anzeigefelds aendern *
     */
    public void setzeGroesse(int neueBreite, int neueHoehe) {
        breite = neueBreite;
        hoehe = neueHoehe;
        obj.setzeGroesse((int) (breite / zoomInhalt), (int) (hoehe / zoomInhalt));
    }

    /**
     * neue Position
     *
	 * @param neuesX
	 * @param neuesY
     */
    public void setzePosition(int neuesX, int neuesY) {
        xPos = neuesX;
        yPos = neuesY;
        obj.setzePosition((int) (xPos / zoomInhalt), (int) (yPos / zoomInhalt));
    }
    
	// Methode noetig zum Hinzufuegen mit Anpassung beim Behaelter
	// Die Enden werden relativ zur aktuellen position verschoben
	public void verschieben(int dx , int dy ) {
		setzePosition(xPos + dx, yPos + dy );
	}



    /**
     *
     * @param neuesX
     * @param neuesY
     * @param neueBreite
     * @param neueHoehe
     */
    public void setzeDimensionen(int neuesX, int neuesY, int neueBreite,
        int neueHoehe) {
        xPos = neuesX;
        yPos = neuesY;
        breite = neueBreite;
        hoehe = neueHoehe;
        obj.setzeDimensionen((int) (xPos / zoomInhalt),
            (int) (yPos / zoomInhalt), (int) (breite / zoomInhalt),
            (int) (hoehe / zoomInhalt));
    }

    /**
     * Mache sichtbar.
     */
    public void sichtbarMachen() {
        sichtbar = true;
        obj.sichtbarMachen();
    }

    /**
     * Mache unsichtbar.
     */
    public void unsichtbarMachen() {
        sichtbar = false;
        obj.unsichtbarMachen();
    }

    /**
     * Bewege horizontal um 'entfernung' Bildschirmpunkte.
     */
    public void horizontalBewegen(int entfernung) {
        xPos += entfernung;
        obj.setzePosition(xPos, yPos);
    }

    /**
     * Bewege vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void vertikalBewegen(int entfernung) {
        yPos += entfernung;
        obj.setzePosition(xPos, yPos);
    }

    /**
     * Bewege horizontal um 'entfernung' Bildschirmpunkte.
     */
    public void nachRechtsBewegen() {
        horizontalBewegen(20);
    }

    /**
     * Bewege einige Bildschirmpunkte nach links.
     */
    public void nachLinksBewegen() {
        horizontalBewegen(-20);
    }

    /**
     * Bewege einige Bildschirmpunkte nach oben.
     */
    public void nachObenBewegen() {
        vertikalBewegen(-20);
    }

    /**
     * Bewege einige Bildschirmpunkte nach unten.
     */
    public void nachUntenBewegen() {
        vertikalBewegen(20);
    }

    /**
     * Bewege vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void langsamVertikalBewegen(int entfernung) {
        int delta;

        if (entfernung < 0) {
            delta = -1;
            entfernung = -entfernung;
        } else {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++) {
            vertikalBewegen(delta);
            StaticTools.warte(10);
        }
    }

    /**
     * Bewege vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void langsamHorizontalBewegen(int entfernung) {
        int delta;

        if (entfernung < 0) {
            delta = -1;
            entfernung = -entfernung;
        } else {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++) {
            horizontalBewegen(delta);
            StaticTools.warte(10);
        }
    }

    public void setzeMitRaster(boolean mitRaster) {
        obj.setzeMitRaster(mitRaster);
    }

    public void setzeDeltaX(int deltaX) {
        obj.setzeDeltaX(deltaX);
    }

    public void setzeDeltaY(int deltaY) {
        obj.setzeDeltaY(deltaY);
    }

    /**
     * Fuer Interface IContainer
     */
    @Override
	public Component add(Component comp, int index) {
        return this.obj.add(comp, index);
    }

    @Override
	public void setzeKomponentenKoordinaten(JComponent obj, int x, int y,
        int width, int height) {
        this.obj.setzeKomponentenKoordinaten(obj, x, y, width, height);
    }

    @Override
	public void setzeKomponentenGroesse(JComponent obj, int width, int height) {
        this.obj.setzeKomponentenGroesse(obj, width, height);
    }

    @Override
	public void setzeKomponentenPosition(JComponent obj, int x, int y) {
        this.obj.setzeKomponentenPosition(obj, x, y);
    }

    @Override
	public void validate() {
        obj.validate();
    }

    /*
     * Ende Interface IContainer
     */

    /**
     * gibt z.B. fuer den Dialog das JPanel-Objekt zurueck
     */
    public JPanel getPanel() {
        return obj;
    }
    
    /**
	 * Entfernen des Graphikobjekts
	 */
	public void entfernen() {
		if (obj != null) {
			obj.ausContainerEntfernen();
			obj = null;
		}
	}
	
	/**
	 * Destruktor
	 */
	@Override
	protected void finalize() {
		if (!Zeichnung.verweistesGUIElementEntfernen) return;
		if (obj != null) entfernen();
	}

	public void expand() {
		obj.expand();
	}

	public void xy() {
		obj.xy();
	}

    
}


@SuppressWarnings("serial")
class CBehaelter extends BasisComponente implements IContainer {
    private boolean mitRaster = false;
    private int deltaX = 100;
    private int deltaY = 100;
    private Vector<BasisComponente> unterComponenten = new Vector<BasisComponente>();
    private String anzeige = null;
    private boolean mitRand = false;
    int anzeigenbreite = 0;
    int anzeigenhoehe = 0;
    int ascend = 0;
    private String hintergrundFarbe = null;
    Color hfarbe;

    public CBehaelter() {
        this.setLayout(null);
    }
    
     @Override
	public Component add(Component comp, int index) {
        Component erg = super.add(comp, index);
        unterComponenten.addElement((BasisComponente) comp);
        return erg;
    }

    @Override
	public void add(Component comp, Object constraints) {
        super.add(comp, constraints);
        unterComponenten.addElement((BasisComponente) comp);
    }

    /**
     * liefert den Zoomfaktor fuer den Behaelter
     *
     * @return
     */
    @Override
	public double getBehaelterZoom() {
        return zoomFaktor * ((IContainer) this.getParent()).getBehaelterZoom();
    }

    @Override
	public double setzeZoomfaktor(double zf) {
        zoomFaktor = zf;
        bzf = ((IContainer) this.getParent()).getBehaelterZoom();
        fontGroesse = (int) Math.round(originalFontGroesse * zoomFaktor * bzf);
        setzeSchriftgroesse(fontGroesse);

        originalXPos = (int) (originalXPos / zoomFaktor);
        originalYPos = (int) (originalYPos / zoomFaktor);

        for (int i = 0; i < unterComponenten.size(); i++) {
            unterComponenten.get(i).zommfaktorAnpassen();
        }

        zoomen();

        if (sichtbar) {
            ((IContainer) this.getParent()).setzeKomponentenKoordinaten(this,
                xPos, yPos, breite, hoehe);
        } else {
            ((IContainer) this.getParent()).setzeKomponentenKoordinaten(this,
                xPos, yPos, 0, 0);
        }

        return zoomFaktor;
    }

    public void setzeMitRand(boolean mitRand) {
        this.mitRand = mitRand;
        Zeichnung.gibZeichenflaeche().repaint();
    }

	@Override
	public void setzeFontName(String name) {
		super.setzeFontName(name);
		repaint();
	}
	
   @Override
	public void setzeSchriftgroesse(float x) {
		setFontsize(x);
        repaint();
    }
    
    public void setText(String s) {
        setzeMitRand(true);
        anzeige = s;
    }

    public void setzeSchriftFarbe(String farbname) {
        farbe = StaticTools.getColor(farbname);
        repaint();
    }

    public void setzeHintergrundfarbe(String neueFarbe) {
        hintergrundFarbe = neueFarbe;

        if (hintergrundFarbe != null) {
            hfarbe = StaticTools.getColor(hintergrundFarbe);
        }
    }

    public void setzeMitRaster(boolean mitRaster) {
        this.mitRaster = mitRaster;
        //		Zeichnung.gibJFrame().repaint();
        Zeichnung.gibZeichenflaeche().repaint();
    }

    public void setzeDeltaX(int deltaX) {
        this.deltaX = deltaX;
    }

    public void setzeDeltaY(int deltaY) {
        this.deltaY = deltaY;
    }

    public void setzeSichtbarkeit(boolean sichtbar) {
        this.getParent().setVisible(sichtbar);
    }

    // Wird von der Graaphikkomponente zum Positionieren im Behaelter aufgerufen
    @Override
	public void setzeKomponentenKoordinaten(JComponent obj, int x, int y,
        int width, int height) {
        obj.setBounds(x, y, width, height);
        repaint();
        validate();
        //		Zeichnung.gibJFrame().validate();
        Zeichnung.gibZeichenflaeche().validate();
    }

    @Override
	public void setzeKomponentenGroesse(JComponent obj, int width, int height) {
        obj.setSize(width, height);
        obj.repaint();
        repaint();
        validate();
        //		Zeichnung.gibJFrame().repaint();
        Zeichnung.gibZeichenflaeche().repaint();
    }

    @Override
	public void setzeKomponentenPosition(JComponent obj, int x, int y) {
        obj.setLocation(x, y);
        obj.repaint();
        repaint();
        validate();
        Zeichnung.gibZeichenflaeche().validate();

        //		Zeichnung.gibJFrame().validate();
    }

    /**
     * Die Darstellung der Komponente wird hier programmiert.
     */
    @Override
	public void paintComponentSpezial(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // Graphik-Abmessungen
        int breite = getSize().width - 1;
        int hoehe = getSize().height - 1;

        if (mitRand) {
            if (hintergrundFarbe != null) {
                g2.setColor(hfarbe);
                g2.fill3DRect(0, 0, breite, hoehe, true);
            }

            g2.setColor(farbe);

            if (anzeige != null) {
                Rectangle2D rec = (g2.getFontMetrics()).getStringBounds(" " +
                        anzeige + " ", g2);
                anzeigenbreite = (int) rec.getWidth();
                anzeigenhoehe = (int) rec.getHeight();
                ascend = g2.getFontMetrics().getMaxAscent();
            }

            if (anzeige != null) {
                g2.drawString(anzeige, 6, ascend);
                g2.drawLine(0, anzeigenhoehe / 2, 4, anzeigenhoehe / 2);
                g2.drawLine(anzeigenbreite + 1, anzeigenhoehe / 2, breite,
                    anzeigenhoehe / 2);
                g2.drawLine(0, anzeigenhoehe / 2, 0, hoehe);
                g2.drawLine(breite, anzeigenhoehe / 2, breite, hoehe);
                g2.drawLine(0, hoehe, breite, hoehe);
            } else {
                g2.draw3DRect(0, 0, breite, hoehe, true);
            }
        }

        if (mitRaster) {
            Color farbe = StaticTools.getColor("schwarz");
            g.setColor(farbe);

            int hor = deltaX;

            while (hor < breite) {
                g2.drawLine(hor, 0, hor, hoehe);
                hor += deltaX;
            }

            int ver = deltaY;

            while (ver < hoehe) {
                g2.drawLine(0, ver, breite, ver);
                ver += deltaY;
            }

            g2.draw3DRect(0, 0, breite, hoehe, true);
            g2.draw3DRect(1, 1, breite - 2, hoehe - 2, true);
        }
    }


}
