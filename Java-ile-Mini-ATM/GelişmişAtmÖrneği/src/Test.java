import java.awt.print.Printable;
import java.io.Console;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		String islemSecenekleri =  "Bakiye G�r�nt�leme : 1"
		                          +"Para �ekmek i�in: 2 "
				                  +"Kendi Hesab�na Para Yat�rmak i�in : 3"
		                          +"Farkl� Hesaba Para Yat�rma: 4"
			                      +"��k�� Yapmak ��in : q ";
		
		
	
		Scanner scanner =new Scanner(System.in);
		
		double bilalBakiye = 2450;
		String  bilalIBAN = "TR12 0578 1845 3652 7785 25 96";
		String bilalKullanici = "bilal12";
		String bilalSifre = "1234";
		
		double enesBakiye = 1200;
		String enesIBAN = "TR45 4521 9658 7854 2485 69 49 ";
		String enesKullanici = "enes26";
		String enesSifre = "5678";
		
		System.out.println("...ATM'YE HO�GELD�N�Z... ");
		System.out.println("L�tfen Bilgilerinizi Giriniz");
		
		System.out.println("Kullan�c� Ad�: ");
		String kullaniciAdi = scanner.nextLine();
		
		System.out.println("�ifreninizi Giriniz: ");
		String sifre = scanner.nextLine();
		
		
		
		if(kullaniciAdi.equals("bilal12") && sifre.equals("1234"))
		{
			System.out.println("Bilal �amur Hesab�na Ho�geldiniz. ");
			
			System.out.println(islemSecenekleri);
			System.out.println("L�tfen Bir Se�im Yap�n�z");
			String secim = scanner.nextLine();
			
			switch (secim) 
			{
			case "1":
				System.out.println("Bakiyeniz : " + bilalBakiye);
				break;
				
			case "2":
				System.out.println("�ekmek �stedi�ingiz Tutar� Giriniz: ");
				int cekilecekTutar = scanner.nextInt();
				
				if(bilalBakiye>=cekilecekTutar)
				{
					bilalBakiye -=cekilecekTutar;
					System.out.println("Para Hesab�n�zdan �ekildi.");
					System.out.println("Kalan Bakiye: " + bilalBakiye);
				}
				else 
				{
					System.out.println("Yeterli Bakiyeniz Bulunmamaktad�r.");
				}
				break;
				
			case "3":{
				System.out.println("Yat�rmak �stedi�iniz Tutar� Giriniz: ");
				int yatirilacakTutar = scanner.nextInt();
				
				bilalBakiye += yatirilacakTutar;
				System.out.println("yeni bakiye"+bilalBakiye);
				
				
				}
				break;
					
					
			case "4":
				
			{	
				System.out.println("L�tfen yat�rmak istedi�iniz tutar� giriniz.");
				int yatirilacakTutar1 = scanner.nextInt();		
				
                if(yatirilacakTutar1<=bilalBakiye)
				{
					System.out.println("Yat�rmak �stedi�iniz �ban Numaras�n� Giriniz:  ");
					String yatirilacakIBANString = scanner.nextLine();
					
					if(yatirilacakIBANString.equals(enesIBAN))
					{
					System.out.println("Para Enes Bayram Adl� Ki�iye G�nderildi.");
					bilalBakiye-= yatirilacakTutar1;
					enesBakiye+=yatirilacakTutar1;
					}
				}
			}
					
			break;		
			
					
			 case "q":
				{
					System.out.println("��k�� yap�ld�");
				}
				
				break;
			}
			
		}
		
		else if (kullaniciAdi.equals("enes26") && sifre.equals("5678"))
		{
			System.out.println("Enes Bayram Hesab�na Ho�geldiniz.");
			System.out.println(islemSecenekleri);
			System.out.println("L�tfen Bir Se�im Yap�n�z");
		}
		else 
		{
			System.out.println("Kullan�c� ad�n�z veya �ifreniz hatal�.!");
		}
	
		
	}

}
