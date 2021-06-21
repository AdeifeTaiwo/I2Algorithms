
package I2AlGORITHMS;
import java.util.Random;

public class PermutateBysorting {
private int n;
private  int P[];
private  int A[];

private Random randomGen = new Random();
public PermutateBysorting(int [] As) {
n = As.length;

P = new int[n];
A = new int[n];
A = As;

}
 public  void permuteBySorting() {
for(int i =0;i<n;i++) {
P[i] = randomGen.nextInt((int) Math.pow(n, 3)); 	
}// end for
for(int i =0;i<P.length;i++) {
System.out.print(P[i]+" ");
}//end for
// sort A using P as the keys
for(int i = 0;i<P.length;i++) {

for(int j = 0;j<P.length;j++) {
if (P[i]<P[j]) {
int temporary1 = P[j];
int temporary2= A[j];

// swap the lesser
P[j] =P[i];
A[j] =A[i];

P[i] = temporary1;
A[i] = temporary2;

}//end if

}// end outer for loop
	
}// end inner for
System.out.println();
for(int i =0;i<P.length;i++) {
System.out.print(P[i]+" ");
}//end for
System.out.println();
for(int i =0;i<A.length;i++) {
System.out.print(A[i]+" ");
}//end for

}// end constructor	


	public void permuteWithoutIdentity() {
System.out.println();
		for(int i =0;i<A.length;i++) {
int Atemp = A[i];
int tempValue =i + randomGen.nextInt((n-i));
A[i] = A[tempValue];
A[tempValue] = Atemp;
System.out.print(A[i]+ " ");
	}	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int A[] = {1,2,3,4};		
PermutateBysorting pBS = new PermutateBysorting(A);
pBS.permuteBySorting();
pBS.permuteWithoutIdentity();

	}

}
