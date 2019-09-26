/**
 * faktor_persekutuan
 * @author sonadztux
 */

import java.util.Scanner;
import java.util.ArrayList;

public class faktor_persekutuan {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Integer> faktor = new ArrayList<Integer>();
    static ArrayList<Integer> persekutuan = new ArrayList<Integer>();

    static void cari_faktor(int bilangan){
        System.out.print("Faktor dari "+bilangan+" : ");
        for (int i = 1; i <= bilangan; i++) {
            if(bilangan % i == 0) {
                System.out.print(i+" "); 
                if(faktor.contains(i)) {
                    persekutuan.add(faktor.get(faktor.indexOf(i)));
                } else {
                    faktor.add(i);
                }   
            }
        }
    }

    static void cetak_perseutuan(int bilangan1, int bilangan2) {
        System.out.print("\nFaktor persekutuan bilangan "+bilangan1+" dan "+bilangan2+" : ");
        for(int angka = 0; angka < persekutuan.size(); angka++) {
            System.out.print(persekutuan.get(angka)+" ");
        }
    }
    

    public static void main(String[] args) {
        System.out.println("Input Faktor Persekutuan 2 Bilangan");
        System.out.print("Angka pertama\t: ");
        int bilangan1 = input.nextInt();
        System.out.print("Angka kedua\t: ");
        int bilangan2 = input.nextInt();


        cari_faktor(bilangan1);
        System.out.println("");
        cari_faktor(bilangan2);
        cetak_perseutuan(bilangan1, bilangan2);
    }
}