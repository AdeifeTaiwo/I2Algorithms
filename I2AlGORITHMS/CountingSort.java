package I2AlGORITHMS;

public class CountingSort {
public static int [] Aa = {329,457,121,657,839,436,720,355};
public static int [] B ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
B = new int [Aa.length];
countingSort(Aa,B,10,0);
for(int i=0;i<B.length;i++) {
	System.out.print(B[i]+ " ");
}
}
public static void countingSort(int [] A,int [] B,int k, int a) 
{
	
if(a<=2) {	

int []C  = new int[k];

for(int i=0;i<C.length; i++) {
	C[i] =0;
	}// end for
for(int j =0;j<A.length;j++) {
	C[ (int) ((A[j]/(Math.pow(10,a)))%10)] = C[ (int) ((A[j]/(Math.pow(10,a)))%10) ]+1;	
	}//C[i] now contains the number of elements equal to i
for(int i=1;i<k; i++) {
	C[i] =C[i]+C[i-1];
	}// end for
for(int j =A.length-1;j>=0;j--) {
	B[C[ (int) ((A[j]/(Math.pow(10,a)))%10)]-1] =  A[j];
	C[ (int) ((A[j]/(Math.pow(10,a)))%10)] =C[(int) ((A[j]/(Math.pow(10,a)))%10)]-1;	
	
}// end for
A=B;
B= new int [A.length];
for(int c =0;c<A.length;c++) {
	System.out.print(A[c]+ " ");
}
System.out.println();
countingSort(A,B,k,a+=1);

}// end if





}// end method counting sort
		
}// end class







