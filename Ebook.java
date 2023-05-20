package zadanie5_4;

public class Ebook extends Ksiazka{
    private int rozmiar;
    private String format;

    public int getRozmiar() {

        return rozmiar;
    }

    public void setRozmiar(int rozmiar) {

        this.rozmiar = rozmiar;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {

        this.format = format;
    }

    public Ebook(String tytul, String autor, int liczbaStron, int rozmiar, String format) {
        super(tytul, autor, liczbaStron);
        setRozmiar(rozmiar);
        setFormat(format);
    }

}
