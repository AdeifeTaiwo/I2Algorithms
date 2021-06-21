package I2AlGORITHMS;

public class RodCutting {
	private static int q;
	private static int [] letter = { 0,1,5,8,9,10,17,17,20,24,30};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintRodSolution( letter,11);
	}
	
public static int[] extendedButtomUp(int [] p, int n) {
int [] r = new int[n];
int [] s = new int[n];
r[0] = 0;
	
	for (int j = 0; j < n; j++) {
		q = -2000000;
		for(int i =0; i<=j; i++) {
			if(q< (p[i] + r[j-i])) {
				q= p[i] + r[j-i];
				s[j] = i;
			}// end if
		r[j] =q;
		}// end for
	
	
	}// end outer for
return r;	
	
}

private static void PrintRodSolution( int [] p, int n) {
	int [] sum;
	int i = n-1;
	sum = extendedButtomUp(p,n);
	
	for(int j =0;j < n; j++) {
		System.out.print(j+ "  ");
	}	
	System.out.println();
	for(int j =0;j < n; j++) {
		System.out.print(sum[j]+ "  ");
	}	
	
	
}
}
