package zadanie5_4;

public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;

    public String getTytul(){

        return this.tytul;
    }

    public void setTytul(String tytul){

        this.tytul = tytul;
    }

    public String getAutor(){

        return this.autor;
    }

    public void setAutor(String autor){

        this.autor = autor;
    }

    public int getLiczbaStron(){

        return this.liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron){

        this.liczbaStron = liczbaStron;
    }
    public Ksiazka(String tytul, String autor, int liczbaStron){
        setTytul(tytul);
        setAutor(autor);
        setLiczbaStron(liczbaStron);
    }
}
