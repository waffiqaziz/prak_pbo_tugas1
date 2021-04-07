package com.menghitung;

public class PersegiPanjang extends BangunDatar {
  PersegiPanjang(int x, int y) {
    super(x, y);
  }

  @Override
  double luas() {
    return x*y;
  }

  @Override
  double keliling() {
    return 2*(x+y);
  }
}
