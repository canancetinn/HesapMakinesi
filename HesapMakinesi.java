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
		System.out.print("��lem numaras� se�in: \n 1- Topla 2- ��kar 3- �arp 4- B�l");
		select = input.nextInt();
		switch(select)
		{
		case 1 :
			System.out.print("Toplam "+ (s1+s2));
			break;
			
		case 2:
			System.out.print("Fark� "+ (s1-s2));
			break;
			
		case 3:
			System.out.print("�arpma"+ (s1*s2));
			break;
			
		case 4:
			System.out.print("B�l�m" + (s1/s2));
			break;
		}
		
			

	}

}
