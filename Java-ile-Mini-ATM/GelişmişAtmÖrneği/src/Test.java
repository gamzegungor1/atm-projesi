import java.awt.print.Printable;
import java.io.Console;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		String islemSecenekleri =  "Bakiye Görüntüleme : 1"
		                          +"Para çekmek için: 2 "
				                  +"Kendi Hesabýna Para Yatýrmak için : 3"
		                          +"Farklý Hesaba Para Yatýrma: 4"
			                      +"Çýkýþ Yapmak Ýçin : q ";
		
		
	
		Scanner scanner =new Scanner(System.in);
		
		double bilalBakiye = 2450;
		String  bilalIBAN = "TR12 0578 1845 3652 7785 25 96";
		String bilalKullanici = "bilal12";
		String bilalSifre = "1234";
		
		double enesBakiye = 1200;
		String enesIBAN = "TR45 4521 9658 7854 2485 69 49 ";
		String enesKullanici = "enes26";
		String enesSifre = "5678";
		
		System.out.println("...ATM'YE HOÞGELDÝNÝZ... ");
		System.out.println("Lütfen Bilgilerinizi Giriniz");
		
		System.out.println("Kullanýcý Adý: ");
		String kullaniciAdi = scanner.nextLine();
		
		System.out.println("Þifreninizi Giriniz: ");
		String sifre = scanner.nextLine();
		
		
		
		if(kullaniciAdi.equals("bilal12") && sifre.equals("1234"))
		{
			System.out.println("Bilal Çamur Hesabýna Hoþgeldiniz. ");
			
			System.out.println(islemSecenekleri);
			System.out.println("Lütfen Bir Seçim Yapýnýz");
			String secim = scanner.nextLine();
			
			switch (secim) 
			{
			case "1":
				System.out.println("Bakiyeniz : " + bilalBakiye);
				break;
				
			case "2":
				System.out.println("Çekmek Ýstediðingiz Tutarý Giriniz: ");
				int cekilecekTutar = scanner.nextInt();
				
				if(bilalBakiye>=cekilecekTutar)
				{
					bilalBakiye -=cekilecekTutar;
					System.out.println("Para Hesabýnýzdan Çekildi.");
					System.out.println("Kalan Bakiye: " + bilalBakiye);
				}
				else 
				{
					System.out.println("Yeterli Bakiyeniz Bulunmamaktadýr.");
				}
				break;
				
			case "3":{
				System.out.println("Yatýrmak Ýstediðiniz Tutarý Giriniz: ");
				int yatirilacakTutar = scanner.nextInt();
				
				bilalBakiye += yatirilacakTutar;
				System.out.println("yeni bakiye"+bilalBakiye);
				
				
				}
				break;
					
					
			case "4":
				
			{	
				System.out.println("Lütfen yatýrmak istediðiniz tutarý giriniz.");
				int yatirilacakTutar1 = scanner.nextInt();		
				
                if(yatirilacakTutar1<=bilalBakiye)
				{
					System.out.println("Yatýrmak Ýstediðiniz Ýban Numarasýný Giriniz:  ");
					String yatirilacakIBANString = scanner.nextLine();
					
					if(yatirilacakIBANString.equals(enesIBAN))
					{
					System.out.println("Para Enes Bayram Adlý Kiþiye Gönderildi.");
					bilalBakiye-= yatirilacakTutar1;
					enesBakiye+=yatirilacakTutar1;
					}
				}
			}
					
			break;		
			
					
			 case "q":
				{
					System.out.println("çýkýþ yapýldý");
				}
				
				break;
			}
			
		}
		
		else if (kullaniciAdi.equals("enes26") && sifre.equals("5678"))
		{
			System.out.println("Enes Bayram Hesabýna Hoþgeldiniz.");
			System.out.println(islemSecenekleri);
			System.out.println("Lütfen Bir Seçim Yapýnýz");
		}
		else 
		{
			System.out.println("Kullanýcý adýnýz veya þifreniz hatalý.!");
		}
	
		
	}

}
