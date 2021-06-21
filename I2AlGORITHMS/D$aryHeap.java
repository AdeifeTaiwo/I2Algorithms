package I2AlGORITHMS;

public class D$aryHeap {
private static int [] array;
private static int []variableArray ={20,32,112,4,1,3,2,16,9,10,14,8,7};
private static int d=6;
private static int heapSize ;

public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println( Math.abs((1/3)-1));

array = new int [variableArray.length];
array = variableArray;

BUILDMAXDHEAP(array);

System.out.println( array[5]);
INSERT(array,2000);
for(int i =0;i<array.length;i++) {
	System.out.print(array[i]+" ");
}// end for
}//end main
public static void BUILDMAXDHEAP(int []A) {
heapSize = A.length;
d =2;
for(int i = A.length/d-1;i>=0;i--) {
DMAX$HEAPIFY(A,i);	
}// end for
}// end buildmaz heapify

public static int PARENT(int i) {
	if(i%2 !=0)
		return	i/d;
	else 
	    return	i/d -1; 

}

public static int CHILD(int k,int i) {
return	d*(i+1) -d+k;

}// end CHILD
public static void DMAX$HEAPIFY(int[]A, int i) {
int largest = i;
for(int k=1;k<=d;k++) {
if(CHILD(k,i)< heapSize && A[CHILD(k,i)]>A[i]) {
if(CHILD(k,i)>largest) {
largest = CHILD(k,i);

}//end if	
}// end if	
}// end for
if(largest != i) {
 int temp = A[i];
  A[i] =A[largest];
  A[largest] = temp;
  DMAX$HEAPIFY(A,largest);
}// end if
}// DMAX$HEAPIFY

public static void  INSERT(int []A,int key) {
array = new int[heapSize+1]; 
array = variableArray;
heapSize +=1;
 A[heapSize-1] = key;
 int i = heapSize;
 while (i >=0 && A[PARENT(i)]< A[i]) {
	 int temp = A[i];
	 A[i] = A[PARENT(i)];
	  A[PARENT(i)] = temp;
 i = PARENT(i);
 
 }//end while
}// end insert

}//end class

