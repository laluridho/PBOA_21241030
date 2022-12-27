package com.tutorial;

public class Main {
    public static void main(String[] args) throws Exception {

       // membuat objek bangun datar
       BangunDatar bangunDatar = new BangunDatar();
        
       // membuat objek persegi 
       persegi persegi = new persegi();
       persegi.setSisi(2);
    

       // membuat objek Segitiga 
       Segitiga Segitiga = new Segitiga();
       Segitiga.setSegitiga(18, 4);
      
       
       // membuat objek Persegi Panjang 
       persegiPanjang persegiPanjang = new persegiPanjang();
       persegiPanjang.setpersegiPanjang(6, 4);
       // membuat objek Lingkaran 
       Lingkaran lingkaran = new Lingkaran();
       lingkaran.setR(4);
         
      // Memangil method luas dan keliling
      bangunDatar.luas();
      bangunDatar.keliling();
      
      System.out.println("==========PERSEGI============");
      persegi.luas();
      persegi.keliling();
      System.out.println("==========SEGITIGA===========");
      Segitiga.luas();
      Segitiga.keliling();
      System.out.println("=======PERSEGI PANJANG=======");
      persegiPanjang.luas();
      persegiPanjang.keliling();
      System.out.println("==========LINGKARAN==========");  
      lingkaran.luas();
      lingkaran.keliling();
        
    
}
}