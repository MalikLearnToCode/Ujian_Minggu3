package Ujian_JUnit;

import java.util.Scanner;

public class Soal2 {
	public void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Masukkan suhu farenheit = ");
		double f = in.nextDouble();
		double c; 
	c = (f-32)*5/9;
		System.out.println(+c);
	}
}
