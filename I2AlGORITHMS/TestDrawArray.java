package I2AlGORITHMS;

import java.util.ArrayList;

public class TestDrawArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int [][] board = new int [4][4];


int index=16;	



for(int j=3;j>=0;j--) {
for(int i =0;i<board.length;i++) {
board[i][j] =index--;	

}
System.out.println();

}
for(int j=3;j>=0;j--) {
for(int i =0;i<board.length;i++) {
	System.out.print(board[i][j]);
}	
System.out.println();
System.out.print(board[3][3]);

}

	
}
	
	
}
