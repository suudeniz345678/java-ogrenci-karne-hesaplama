import java.util.Scanner;
public class notvedurum {
		public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); 
	System.out.println("Öğrencinin adı=");
	String ogrencininAdi = scanner.next();
	System.out.println("Öğrencinin soyadı=");
	String ogrencininSoyadi = scanner.next();
	System.out.println("Öğrencinin okul numarası");
	double ogrenciNo = scanner.nextDouble();
	System.out.println("Öğrencinin bölümü=");
	String ogrenciBolum = scanner.next();
	System.out.println("Öğrencinin vize notu=");
	double vizeNotu = scanner.nextDouble();
	System.out.println("Öğrencinin final notu=");
	double finalNotu = scanner.nextDouble();
	double dersOrtalamasi = (vizeNotu * 0.40) + (finalNotu * 0.60);
	String durum;
	if ((finalNotu >= 50) && (dersOrtalamasi >= 50) ) {
		durum = "GEÇTİ";
	}else { 
		durum = "KALDI";
	}
	System.out.println("Öğrencinin ders ortalaması:" + dersOrtalamasi);
	System.out.println("Öğrencinin mevcut durumu:" + durum);
	scanner.close();
		}
	}

