package com.menghitung;

public class Lingkaran extends BangunDatar {

  Lingkaran(int x) {
    super(x);
    // x = jari-jari
  }

  @Override
  double luas() {
    return Math.PI * (x * x) * 1d;
  }

  @Override
  double keliling() {
    return 2d * Math.PI * x;
  }
}
