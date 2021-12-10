package Ujian_JUnit;

import java.util.Scanner;

public class Soal1 {
	 public static void main(String [] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Masukkan Panjang Kolam = ");
		 double panjang = in.nextDouble();
		 System.out.println("Masukkan Lebar Kolam = ");
		 double lebar = in.nextDouble();
		 System.out.println("Masukkan Tinggi Kolam = ");
		 double tinggi = in.nextDouble();
		 
		 double keliling;
	     
	     keliling = (panjang + lebar + tinggi) * 4; 
	 
	     
	         System.out.println("Berikut adalah hasil hitung keliling kolam dengan panjang " + panjang +   
	             ", lebar " + lebar + " dan tinggi " + tinggi + " adalah "  
	         + keliling); 	       
	         System.out.println();	
	   }
	 public double volumeAirKolam(double panjang, double lebar, double tinggi) {
		 
		 return panjang * lebar * tinggi ; 
		 	
	 }
	 public double kelilingKolam(double panjang, double lebar, double tinggi) {
		 
		 return panjang * lebar * tinggi ; 
	 }
}


	 
