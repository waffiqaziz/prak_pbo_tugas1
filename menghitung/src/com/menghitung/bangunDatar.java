package com.menghitung;

public class bangunDatar {
  int x;
  int y;
  // x & y bisa berupa alas, panjang, tinggi maupun sisi

  public bangunDatar(int x, int y) { // untuk bangun datar segitiga, persegi panjang
    this.x = x;
    this.y = y;
  }

  public bangunDatar(int x2) { // untuk bangun datar persegi, lingkaran
    this.x = x2;
  }

  double luas() {
    // --setiap bangun datar memiliki perhitungan keliling masing-masing
    return 0;
  }

  double keliling() {
    // --setiap bangun datar memiliki perhitungan keliling masing-masing
    return 0;
  }
}
