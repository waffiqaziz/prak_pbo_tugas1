package com.menghitung;

public abstract class BangunRuang {
  int x, y, z;
  // x, y & z bisa berupa alas, panjang, tinggi maupun sisi bangun ruang

  public BangunRuang(int x) {
    this.x = x;
  }

  public BangunRuang(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public BangunRuang(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  abstract double luas();

  abstract double volume();

  void display() {
    System.out.println("Luas\t: " + luas());
    System.out.println("Volume\t: " + volume());
  }

}
