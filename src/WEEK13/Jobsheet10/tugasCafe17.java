package WEEK13.Jobsheet10;

import java.util.Scanner;

public class tugasCafe17 {
    
    //fungsi input data 
    public static void inputData(int[][] rekapPenjualan, String[] menu) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rekapPenjualan.length; i++) {
            System.out.println("Menu : " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Penjualan hari ke-" + (j + 1) + " : ");
                rekapPenjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        sc.close(); // Mengembalikan array setelah diisi
    }

    //fungsi menampilkan keseluruhan data
    public static void tabel(int[][] rekapPenjualan, String[] menu) {
        System.out.print("\t");
        for (int i = 0; i < 7; i++) {
            System.out.print("\tHari ke-"+(1+i));
        }
        for (int i = 0; i < menu.length; i++) {
            System.out.print("\n"+menu[i]+" :\t");
            for (int j = 0; j < rekapPenjualan[i].length; j++) {
                System.out.print("\t"+rekapPenjualan[i][j]+"\t");
            }
        }
        System.out.println();
    }
    
    //fungsi  menampilkan Menu yang memiliki penjualan tertinggi
    public static void menuTertinggi(int[][] rekapPenjualan, String[] menu) {
        
        int tertinggi = 0;
        int totalPerMenu = 0;
        int indexMax = 0;
        System.out.println();
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < rekapPenjualan[i].length; j++) {
                totalPerMenu += rekapPenjualan[i][j];
            }
            if (totalPerMenu > tertinggi) {
                indexMax = i;
            }
        }
        System.out.println();
        System.out.println("Menu yang memiliki penjualan tertinggi adalah : "+menu[indexMax]);
    }
    //fungsi menampilkan rata rata penjualan
    public static void rataRata(int[][] rekapPenjualan, String[] menu) {
        System.out.println();
        double rata2 = 0;
        int totalPerMenu = 0;
        for (int i = 0; i < menu.length; i++) {
            rata2 = 0;
            for (int j = 0; j < rekapPenjualan[i].length; j++) {
                totalPerMenu += rekapPenjualan[i][j];
                rata2= totalPerMenu/ rekapPenjualan[i].length;
            }
            System.out.println();
            System.out.println("Total untuk menu "+menu[i]+" adalah : "+totalPerMenu);
            System.out.println("Rata- rata "+menu[i]+" adalah : "+rata2);
        }
    }

    //fungsi main
    public static void main(String[] args) {
        String menu[] = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        int rekapPenjualan[][]= new int[menu.length][7];
        
        //pemanggilan fungsi
        inputData(rekapPenjualan, menu);
        tabel(rekapPenjualan, menu);
        menuTertinggi(rekapPenjualan, menu);
        rataRata(rekapPenjualan, menu);
    }
}
