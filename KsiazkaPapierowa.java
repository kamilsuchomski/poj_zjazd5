package zadanie5_4;

public class KsiazkaPapierowa extends Ksiazka{
    private int rokWydania;

    public void setRokWydania(int rokWydania) {

        this.rokWydania = rokWydania;
    }

    public int getRokWydania() {

        return rokWydania;
    }

    public KsiazkaPapierowa(String tytul, String autor, int liczbaStron, int rokWydania){
        super(tytul, autor, liczbaStron);
        setRokWydania(rokWydania);
    }
}
