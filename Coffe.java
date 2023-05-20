package zadanie5_3;

import java.util.Iterator;
import java.util.List;

public class Coffe {
    public static void main(String[] args) {

        List<String> lista = List.of(
                "espresso", "latte", "cappuccino",
                "mocha", "auLait", "macchiato");
        System.out.println(lista);

        Iterator<String> iteratorLista = lista.iterator();

        while(iteratorLista.hasNext()){
            System.out.println(iteratorLista.next());
        }

        for(String kawa : lista){
            System.out.println(kawa.toUpperCase());
        }

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).substring(0, 4));
        }
    }
}
