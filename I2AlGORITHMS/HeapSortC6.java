package I2AlGORITHMS;

public class HeapSortC6 {
public static int index =0;
private static int l;
private static int r;
private static int largest;
private static int [] array= {20,32,112,4,1,3,2,16,9,10,14,8,7};
private static int [] array2= new int[12];
private static int [] variableArray ={15,13,9,5,12,8,7,4,0,6,2,1};

private static int heapSize ;

public static void main(String[] args) {
		// TODO Auto-generated method stub

array2 = variableArray;
buildHeapify(array2);

System.out.println(HeapMaximum(array2));

System.out.println(HeapExtractMax(array2));
heapSort(array2);
for(int i =0;i<array2.length;i++) {
	System.out.print(array2[i]+" ");
}// end for
System.out.println();
MaxHeapInsert(array2,10);
buildHeapify(array2);
heapSort(array2);
for(int i =0;i<array2.length;i++) {
	System.out.print(array2[i]+" ");
}// end for

}// end method main

public static void buildHeapify(int []A) {
	heapSize = A.length;
for(int i = 0;i<heapSize/2;i++)
	maxHeapify(array2,0);
}

public static int parent(int i) {
if(i%2 !=0)
return	i/2;
else 
return (i/2)-1;
}// end method parent
public static int left(int i) {
	return (2*i +1);
}// end method left
public static int right(int i) {
	return (2*i+2);
}
// method max-heapify
public static void maxHeapify(int []A,int i) {

while(i<A.length) {
l = left(i);
r = right(i);
if(l<heapSize && A[l]>A[i]) {
largest = l;
}
else 
 largest = i;
if(r<heapSize && A[r]>A[largest]) {
	largest = r;
} 
if(largest != i) {
	int temp = A[i];
	A[i] =A[largest];
	A[largest] =temp;
}// end if
i++;
}// end while
}// end MAX-HEAPIFY

public static void heapSort(int[] A) {
buildHeapify(A);
for(int i= A.length-1;i>=1;i--) {
  int temporary2 = A[i];
  A[i] = A[0];
  A[0]=temporary2;// exchange A[1] with temporary2
  heapSize = heapSize -1;
  maxHeapify(A,0);
}// end for	
}// end heap sort

public static int HeapMaximum(int[]A) {
return A[0];	
}
public static int HeapExtractMax(int[]A) {
if(heapSize<0) {
	System.err.println("error heap underflow");
}// end if
int max = A[0];
A[0]=A[heapSize-1];
heapSize-=1;
maxHeapify(A,0);
return max;
}

public static void HeapIncreaseKey(int []A,int i,int key) {
if(key<A[i]) {
	System.err.println("error ,\"new key is smaller than current key\" ");
	}// end if
A[i] = key;
while(i>0&& A[parent(i)]<A[i]) {
	int temp3 = A[i];
	A[i] = A[parent(i)];
	A[parent(i)]= temp3;
	i=parent(i);
}// end while
}// end heapIncreasekey

public static void MaxHeapInsert(int []A, int key) {
array2 = new int[heapSize+1];
array2 = variableArray;
heapSize = heapSize+1;
A[heapSize] = -20000000;
HeapIncreaseKey(A,heapSize,key);
}


}// end class 
