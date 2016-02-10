import java.util.Scanner;

public class Trik {

	public static void main(String[] args) {
		int left=1,center=0,right=0,temp,i;
		String change;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Value : ");
		change = scan.next();
		
		for(i=0;i<change.length();i++){
			if(change.charAt(i) == 'A' || change.charAt(i) == 'a'){
				temp=left;
				left=center;
				center=temp;
			}else if(change.charAt(i) == 'B' || change.charAt(i) == 'b'){
				temp=center;
				center=right;
				right=temp;
			}else{
				temp=left;
				left=right;
				right=temp;
				}
			}
		
		if(left == 1) System.out.println("Coin is in Left glass");
		else if(center == 1) System.out.println("Coin is in Center glass");
		else System.out.println("Coin is in Right glass");

	}

}
