package zadanie5_4;

import java.util.List;

public class TestKsiazka {
    public static void main(String[] args) {

        Ebook ebookObj1 = new Ebook("Odporny", "Michael Palmer", 476, 6543, "PDF");
        Ksiazka ksiazkaObj1 = new Ksiazka("Pielgrzym", "Terry Hayes", 784);
        KsiazkaPapierowa ksiazkaPapierowaObj1 = new KsiazkaPapierowa("Niewinny", "Harlan Coben", 416, 2005);

        Ebook ebookObj2 = new Ebook("Maly Ksiaze", "Antoine de Saint-Exupery", 80, 2631, "MOBI");
        Ksiazka ksiazkaObj2 = new Ksiazka("Obcy", 	"Albert Camus", 185);
        KsiazkaPapierowa ksiazkaPapierowaObj2 = new KsiazkaPapierowa("Rok 1984", "George Orwell", 236, 1949);

        List<String> listaTytulowKsiazek = new java.util.ArrayList<>(List.of(
                ebookObj1.getTytul(), ksiazkaObj1.getTytul(), ksiazkaPapierowaObj1.getTytul(),
                ebookObj2.getTytul(), ksiazkaObj2.getTytul(), ksiazkaPapierowaObj2.getTytul()));

        System.out.println(listaTytulowKsiazek);

        //listaTytulowKsiazek.stream().sorted((tytul1, tytul2) -> tytul1.compareTo(tytul2)).forEach(System.out::println);

        listaTytulowKsiazek.sort((tytul1, tytul2) -> tytul1.compareTo(tytul2));

        System.out.println(listaTytulowKsiazek);
    }
}
