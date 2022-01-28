package Hesapmakinesi;
import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		int s1, s2, select;
		Scanner input = new Scanner(System.in);
		System.out.print("1.sayi giriniz:");
		s1 = input.nextInt();
		System.out.print("2.sayi giriniz:");
		s2 = input.nextInt();
		System.out.print("Ýþlem numarasý seçin: \n 1- Topla 2- Çýkar 3- Çarp 4- Böl");
		select = input.nextInt();
		switch(select)
		{
		case 1 :
			System.out.print("Toplam "+ (s1+s2));
			break;
			
		case 2:
			System.out.print("Farký "+ (s1-s2));
			break;
			
		case 3:
			System.out.print("Çarpma"+ (s1*s2));
			break;
			
		case 4:
			System.out.print("Bölüm" + (s1/s2));
			break;
		}
		
			

	}

}
