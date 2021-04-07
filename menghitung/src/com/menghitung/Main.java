package com.menghitung;
// @author WAFFIQ AZIZ / 123190070

import java.util.InputMismatchException;
import java.util.Scanner;

/* GUIDE 
  PILIHAN MENU :
    segitiga
    persegi 
    persegi panjang  
    lingkaran 
    kubus 
    balok
    silinder
    keluar

  CONTOH OUTPUT
    kubus >>>
      luas persegi =
      keliling perseegi =
      volume kubus = 
      luas permukaan kubus =
*/

public class Main {

  public static void main(String[] args) {
    int pilihan = 0;
    int x, y, z;
    bangunDatar segitiga1, persegi1, persegiPanjang1, lingkaran1;

    do {
      CLC();
      System.out.println("\nPILIH BANGUN DATAR ATAU BANGUN RUANG DIBAWAH INI");
      System.out.println("1. Segitiga siku siku\n2. Persegi\n3. Persegi panjang");
      System.out.println("4. Lingkaran\n5. Kubus\n6. Balok\n6. Silinder\n7. Keluar");

      do {
        pilihan = getUserInput("PILIHAN : ");
      } while (pilihan == 0);

      switch (pilihan) {
      case 1: // SEGITIGA
        x = getUserInput("Alas Segitiga\t:");
        y = getUserInput("Tinggi Segitiga\t: ");
        segitiga1 = new Segitiga(x, y);

        System.out.println("\n-----HASIL PERHITUNGAN-----");
        System.out.println("Luas\t\t: " + segitiga1.luas());
        System.out.println("Keliling\t: " + segitiga1.keliling());
        break;
      case 2: // PERSEGI
        x = getUserInput("Sisi Persegi\t:");
        persegi1 = new Persegi(x);

        System.out.println("\n-----HASIL PERHITUNGAN-----");
        System.out.println("Luas\t\t: " + persegi1.luas());
        System.out.println("Keliling\t: " + persegi1.keliling());
        break;
      case 3: // PERSEGI PANJANG
        x = getUserInput("Lebar persegi panjang\t:");
        y = getUserInput("Panjang persegi panjang\t:");
        persegiPanjang1 = new persegiPanjang(x,y);

        System.out.println("\n-----HASIL PERHITUNGAN-----");
        System.out.println("Luas\t\t: " + persegiPanjang1.luas());
        System.out.println("Keliling\t: " + persegiPanjang1.keliling());
        break;
      case 4: // LINGKARAN
        x = getUserInput("Jari-jari lingkaran\t:");
        lingkaran1 = new Lingkaran(x);

        System.out.println("\n-----HASIL PERHITUNGAN-----");
        System.out.println("Luas\t\t: " + lingkaran1.luas());
        System.out.println("Keliling\t: " + lingkaran1.keliling());
        break;
      case 5:
        break;
      case 6:
        break;
      case 7:
        break;
      }
    } while (pilihan != 7);

  }

  private static void CLC() { // clear screen, LINK : https://stackoverflow.com/a/17015039/12159309
    try {
      final String os = System.getProperty("os.name");
      if (os.contains("Windows")) {
        Runtime.getRuntime().exec("cls");
      } else {
        Runtime.getRuntime().exec("clear");
      }
    } catch (final Exception e) {
    }
  }

  private static int getUserInput(String var) { // LINK : https://codereview.stackexchange.com/a/245276
    Scanner inputUser = new Scanner(System.in);
    int pilihan;

    while (true) {
      try {
        System.out.print(var);
        pilihan = inputUser.nextInt();
        if (pilihan <= 0) {
          throw new InputMismatchException();
        }
        break;
      } catch (InputMismatchException e) {
        System.out.println("\nInput Harus Angka!!!");
        inputUser.nextLine();
      }
    }
    return pilihan;
  }
}
