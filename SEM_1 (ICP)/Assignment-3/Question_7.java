import java.util.Scanner;
public class Question_7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the electricity unit: ");
		int x=sc.nextInt();
		double bill=0;
		if(x<=50) {
			bill=x*3;
		}
		else if(x>50 && x<=200){
			bill=50*3+(x-50)*4.8;
		}
		else if(x>200 && x<=400){
			bill=50*3+150*4.8+(x-200)*5.8;
		}
		else if(x>400){
			bill=50*3+150*4.8+200*5.8+(x-400)*6.2;
		}

        System.out.print("Do you want to pay bill online:");
		char ch = sc.next().charAt(0);
		sc.close();
	    if(ch=='y'){
            double d=0.03*bill;
			bill = bill - d;
		    System.out.println("Discount: " + d);
		    System.out.println("Amount payable: " + bill);
	    }
	    else {
	    	System.out.println("Amount payable: " + bill);		
	    }
    }
}
