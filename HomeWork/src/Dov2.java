
	import java.util.Scanner;
public class Dov2 {
	
		int Average=0;
		int p = 6;
		
		public Dov2() {			
			
			Scanner scan = new Scanner(System.in);
			int OOP2;
			System.out.print("OOP2 :");
			 OOP2 =scan.nextInt();		
		
			int WebDesign2;
			System.out.print("WebDesign2 :");
			WebDesign2 =scan.nextInt();
			
			int ComputerNetwork;
			System.out.print(" ComputerNetwork :");
			ComputerNetwork =scan.nextInt();			
			
			int SystemAnalysis;
			System.out.print("SystemAnalysis :");
			SystemAnalysis =scan.nextInt();
				
				
			int OperatingSystems;
			System.out.print(" OperatingSystems :");
			OperatingSystems =scan.nextInt();			
			
			int Calcus;
			System.out.print("Calcus :");
			Calcus =scan.nextInt();
			
			int sum =  OOP2 + WebDesign2 + SystemAnalysis + OperatingSystems + Calcus;
			Average = sum/p;
			System.out.print("Sum :"+sum + " \n Average : "+Average +"\n");
			
			return;
			
		}

	}



