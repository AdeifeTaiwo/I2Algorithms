package I2AlGORITHMS;

public class QuickSortI2A {
private static int [] theArray = {2,8,7,1,3,5,6,4,12,5};
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	tailRecursiveQuicksort(theArray,0,theArray.length-1);
	for(int i =0;i<theArray.length;i++) {
		System.out.print(theArray[i]+ " ");
	}// end for
	}
public static void quickSort(int []A,int p,int r) {
if(p<r) {
int q = partition(A,p,r);
quickSort(A,p,q-1);
quickSort(A,q+1,r);
}// end if	

}
public static int partition(int []A,int p,int r) {
int x = A[r];
int i =p-1;
for(int j =p;j<r;j++) {
	if(A[j]<=x) {
		i =i+1;
		int temp = A[j];
		A[j] = A[i];                           
		A[i] = temp;
	}//end if

}//end for
// exchange A[i+1] with A[j]
int temp2 = A[i+1];
A[i+1] = A[r];
A[r] = temp2;
return i+1;
}	
public static void tailRecursiveQuicksort(int [] A, int p, int r) {
while(p<r) {
	int q = partition(A,p,r);	
	tailRecursiveQuicksort(A,p,q-1);
	p=q+1;
	}	
}
}