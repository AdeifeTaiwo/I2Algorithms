package I2AlGORITHMS;

import java.util.Scanner;

public class BinarySum {
private static int carryOver =0;
private static int countA;
private static int countB;
private static String forA;
private static String forB;

private static StringBuilder combined= new StringBuilder(10);

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

while(true) {

System.out.println("enter two n-binary inputs");

forA = input.nextLine();
forB = input.nextLine();
countA = forA.length();// get the length of codes
countB = forB.length(); // get the length of codes

System.out.printf("%d %d\n\n",countA,countB);


System.out.print(solveBinary(forA,forB,countA,carryOver)+"\n");
combined = new StringBuilder(10);

}// 
}

private static String solveBinary(String forA2, String forB2, int countA2,int carryOver2) {

	
if(countA2==0)
	return combined.append(carryOver2).reverse().toString();
else {
int sum = Integer.parseInt(forA2.substring(countA2-1,countA2))+
Integer.parseInt(forB2.substring(countA2-1,countA2))+carryOver2;

switch(sum) {
case 0:
	combined.append(String.format("%d", 0));
	carryOver2 =0;
	break;


case 1:
	combined.append(String.format("%d", 1));
	carryOver2 =0;
	break;


case 2:
	combined.append(String.format("%d", 0));
	carryOver2 =1;
	break;
case 3:
	combined.append(String.format("%d", 1));
	carryOver2 =1;
	break;
	
default:
	combined.append(String.format("%d", 0));
	carryOver2 =0;
	break;	
}// end switch
		
return solveBinary( forA2, forB2, countA2-1, carryOver2);
}// end else


	
	
	
}






}
