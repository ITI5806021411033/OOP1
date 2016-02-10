import java.util.Scanner;

public class Kornislav {

	public static void main(String[] args) {
		int value1,value2,value3,value4,temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Value1 : ");
		value1=scan.nextInt();
		System.out.print("Enter Value2 : ");
		value2=scan.nextInt();
		System.out.print("Enter Value3 : ");
		value3=scan.nextInt();
		System.out.print("Enter Value4 : ");
		value4=scan.nextInt();
		
		if(value1>value2){
			temp=value1;
			value1=value2;
			value2=temp;
		}
		
		if(value1>value3){
			temp=value1;
			value1=value3;
			value3=temp;
		}
		
		if(value1>value4){
			temp=value1;
			value1=value4;
			value4=temp;
		}
		
		if(value2>value3){
			temp=value2;
			value2=value3;
			value3=temp;
		}
		
		if(value2>value4){
			temp=value2;
			value2=value4;
			value4=temp;
		}
		
		if(value3>value4){
			temp=value3;
			value3=value4;
			value4=temp;
		}
		
		System.out.print("\nRectangle Area = : "+""+value3+""+" * "+value1+" = "+value3*value1);

	}

}
