import java.util.Scanner;
public class SwitchCaseileCalculator {

	public static void main(String[] args) {
		int n1, n2, select;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�ki say� giriniz :");
		n1 = input.nextInt();
		n2 = input.nextInt();
		
		System.out.println("Girilen sayilar : "+n1+ " ve "+n2);
		
		System.out.println("Yap�lacak i�lemi se�iniz.");
		System.out.println("1 - Toplama\n2 - ��karma\n3 - �arpma\n4 - B�lme");
		select = input.nextInt();
		
		switch(select) {
		     case 1:
		    	 System.out.println("Toplama se�ildi : "+ (n1+n2));
		    	 break;
		     case 2:
		    	 System.out.println("��karma se�ildi : "+ (n1-n2));
		    	 break;
		     case 3:
		    	 System.out.println("�arpma se�ildi : "+ (n1*n2));
		    	 break;
		     case 4:
		    	 System.out.println("B�lme se�ildi");
		    	 if(n2 == 0) {
		    		 System.out.println("Say� 0 a b�l�nemez !");
		    	 }
		    	 else {
		    		 System.out.println((n1/n2));
		    	 }
		    	 break;
		     default:
		    	 System.out.println("��lem ge�ersiz");
		    	 
		}

	}

}
