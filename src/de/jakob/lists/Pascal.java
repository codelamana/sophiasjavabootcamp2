package de.jakob.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Pascal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte Anzahl an Ebenen eingeben: ");
        int n = sc.nextInt();

        // Array von ArrayLists
        ArrayList<Integer> [] zeilen = new ArrayList[n];

        // 0te Zeile initialisieren
        zeilen[0] = new ArrayList<>();
        zeilen[0].add(1); // In der ersten Zeile steht nur eine 1

        // Die weiteren Zeilen befüllen (bis n, die ANzahl der Ebenen die gefragt sind.
        for (int i = 1; i < n; i++) {

            //Die i-te Zeile initialisieren
            zeilen[i] = new ArrayList<>();

            //Links steht immer eine 1
            zeilen[i].add(1);

            // Die Zahlen dazwischen, geht über die Zeile davor und rechnet immer zwei werte zusammen
            for(int j = 0; j < zeilen[i-1].size() - 1; j++){

                // Fügt aus der i-1-te Zeile die Summe aus den j-ten und j+1-ten Einträgen ein
                zeilen[i].add(zeilen[i-1].get(j) + zeilen[i-1].get(j+1));
            }

            // Rechts auch immer eine 1
            zeilen[i].add(1);
        }

        // Pascalsches Dreieck printen
        for(ArrayList p : zeilen){
            System.out.println(p.toString());
        }
    }
}
