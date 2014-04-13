import ea.*;

/**
 * Diese Klasse demonstriert ein paar Möglichkeiten, die die
 * Tastatureingaben-Verarbeitung der Engine bietet.
 * @author Michael Andonie
 */
public class Spiel
extends Game 
implements TasteLosgelassenReagierbar {
    
    /**
     * Ein Rechteck als bewegbare Spielfigur
     */
    private Rechteck rechteck;
    
    /**
     * Ein Kreis als zweite bewegbare Spielfigur
     */
    private Kreis kreis;
    
    /**
     * Konstruktor startet das Beispiel.
     */
    public Spiel() {
        super(500, 300, "Tastatur-Beispiel"); //Fenster: Breite 500 x Höhe 300, Titel "Tastatur Beispiel"
        
        //Erstelle die Spielfiguren
        rechteck = new Rechteck(50, 50, 30, 50);
        rechteck.farbeSetzen("Blau");
        
        kreis = new Kreis(300, 200, 40);
        kreis.farbeSetzen("Lila");
        
        //mache Spielfiguren sichtbar -> an Wurzel anmelden
        wurzel.add(rechteck);
        wurzel.add(kreis);
        
        
    }
    
    
    public void TasteReagieren(int code) {
        //
    }
    
}