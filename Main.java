package zadanie5_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        ArrayList<Integer> tablica = new ArrayList<Integer>();

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                tablica.add(i);
            }
        }

        for(int i = 0; i < tablica.size(); i++){
            System.out.println("[" + i + "]" + tablica.get(i));
        }

        System.out.println("Czas wykonania operacji[ms]: " + (System.currentTimeMillis() - start));
    }
}