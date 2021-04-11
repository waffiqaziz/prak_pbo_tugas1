package com.menghitung;

public class PersegiPanjang extends BangunDatar {
  PersegiPanjang(int x, int y) {
    super(x, y);
    // x = lebar, y = panjang
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
