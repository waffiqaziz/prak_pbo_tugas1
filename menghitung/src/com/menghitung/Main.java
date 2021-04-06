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

    do {
      CLC();
      System.out.println("PILIH BANGUN DATAR ATAU BANGUN RUANG DIBAWAH INI");
      System.out.println("1. Segitiga\n2. Persegi\n3. Persegi panjang");
      System.out.println("4. Lingkaran\n5. Kubus\n6. Balok\n6. Silinder\n7. Keluar");

      do {
        pilihan = getUserInput("PILIHAN : ");
      } while (pilihan == 0);

      switch (pilihan) {
        case 1:
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        case 5:
          break;
        case 6:
          break;
        case 7:
          break;
      }
    }while(pilihan != 7);

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

  private static int getUserInput(String var) {  // LINK : https://codereview.stackexchange.com/a/245276
    Scanner inputUser = new Scanner(System.in);
    int pilihan;
    
    while(true) {
        try {
            System.out.print(var);
            pilihan = inputUser.nextInt();
            if(pilihan <= 0) {
                throw new InputMismatchException();
            }
            break;  
        }
        catch(InputMismatchException e) {
            System.out.println("\nInput Harus Angka!!!");
            inputUser.nextLine();
        }
    } 
    return pilihan;
  }
}
