import java.util.Scanner;
public class SwitchCaseileCalculator {

	public static void main(String[] args) {
		int n1, n2, select;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ýki sayý giriniz :");
		n1 = input.nextInt();
		n2 = input.nextInt();
		
		System.out.println("Girilen sayilar : "+n1+ " ve "+n2);
		
		System.out.println("Yapýlacak iþlemi seçiniz.");
		System.out.println("1 - Toplama\n2 - Çýkarma\n3 - Çarpma\n4 - Bölme");
		select = input.nextInt();
		
		switch(select) {
		     case 1:
		    	 System.out.println("Toplama seçildi : "+ (n1+n2));
		    	 break;
		     case 2:
		    	 System.out.println("Çýkarma seçildi : "+ (n1-n2));
		    	 break;
		     case 3:
		    	 System.out.println("Çarpma seçildi : "+ (n1*n2));
		    	 break;
		     case 4:
		    	 System.out.println("Bölme seçildi");
		    	 if(n2 == 0) {
		    		 System.out.println("Sayý 0 a bölünemez !");
		    	 }
		    	 else {
		    		 System.out.println((n1/n2));
		    	 }
		    	 break;
		     default:
		    	 System.out.println("Ýþlem geçersiz");
		    	 
		}

	}

}
