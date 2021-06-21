package I2AlGORITHMS;

public class SquareMatrixMultiply {
private static int [][] C;
public static int squareMatrix(int[][] A,int [][]B) {
int n = A.length;
C = new int [n][n];
for(int i=0;i<n;i++) {
	for(int j =0;j<n;j++) {
		C[i][j] =0;
	     for(int k =0;k<n;k++) {
		 C[i][j] +=A[i][k]*B[k][j];
		         
	     }// end for
	     System.out.print(C[i][j]+ " ");  
			
	}// end for
System.out.println();
}// end for

return 0;
}// end method

public static int Strassen(int[][]A,int [][]B)	{
int n = A.length;
if(A.length==1) {
	return A[0][0]*B[0][0];
}// end if
int C [][] = new int [n][n];

int [][]a11= new int[1][1];
a11[0][0]= A[0][0];

int [][]a12 = new int[1][1];
a12[0][0]= A[0][1];

int [][]a21=new int[1][1];
a21[0][0]= A[1][0];

int [][]a22 = new int[1][1];
a22[0][0]= A[1][1];

// new B matrix
int [][]b11=   new int[1][1];
b11[0][0]= B[0][0];

int [][]b12 = new int[1][1];
b12[0][0]= B[0][1];

int [][]b21=  new int[1][1];
b21[0][0]= B[1][0];

int [][] b22 = new int[1][1];
b22[0][0]= B[1][1];

// new sum-difference matrix 
int [][] s1 = new int [1][1];
s1[0][0] = b12[0][0] -b22[0][0];

int [][] s2 = new int [1][1];
s2[0][0] = a11[0][0] +a12[0][0];

int [][] s3 = new int [1][1];
s3[0][0] = a21[0][0] +a22[0][0];

int [][] s4 = new int [1][1];
s4[0][0] = b21[0][0] -b11[0][0];

int [][] s5 = new int [1][1];
s5[0][0] = a11[0][0] +a22[0][0];

int [][] s6 = new int [1][1];
s6[0][0] = b11[0][0] +b22[0][0];

int [][] s7 = new int [1][1];
s7[0][0] = a12[0][0] -a22[0][0];

int [][] s8 = new int [1][1];
s8[0][0] = b21[0][0] +b22[0][0];

int [][] s9 = new int [1][1];
s9[0][0] = a11[0][0] -a21[0][0];

int [][] s10 = new int [1][1];
s10[0][0] = b11[0][0] +b12[0][0];

// new product matrix
int  p1 = Strassen(a11,s1);
int  p2 = Strassen(s2,b22);
int  p3 = Strassen(s3,b11);

int  p4 = Strassen(a22,s4);

int  p5 = Strassen(s5,s6);
int  p6 = Strassen(s7,s8);
int  p7 = Strassen(s9,s10);

C[0][0] = p5+p4-p2+p6;
C[0][1] = p1+p2;
C[1][0] = p3+p4;
C[1][1] = p5+p1-p3-p7;

for(int i=0;i<C.length;i++) {
	for(int j =0;j<C[i].length;j++) {
System.out.print(C[i][j]+" ");		
	}
	System.out.println();
}

return C[0][1];

}
public static void complexMultiply(int a, int b, int c ,int d) {
int []C = new int [2];	
C[0] = a*c -b*d;
C[1] = c*b + a*d;
System.out.print(C[0] +" "+ C[1]+"i");

}	
public static void main(String[] args) {
  // TODO Auto-generated method stub
int A[][] = {{1,3},{7,4}};
int B[][] = {{6,1},{1,1}};
System.out.println(B[1][0]+"**");

System.out.println(Strassen(A,B));
System.out.print(squareMatrix(A,B));
complexMultiply(1,2,3,4);
	
}


	

}


