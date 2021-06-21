package I2AlGORITHMS;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Snake$$Ladder {
//****************8new please
	private static int [][] board;
private static int B;//boardSize;
private static int P;// board size
private static int S;//number Of snakes;
// S lines for each
private static int L;//lines for each snake;
// with L lines, for each
private static int K;// number of rolls;
private static String inputted;
private static String inputtedLadder;


public static enum Static{CONTINUE,WON};
public static enum Status1{CONTINUE,WON,STOP};
public static enum Status2{CONTINUE,WON,STOP};

private static int combinedPlayer1;
private static int combinedPlayer2;
private static int [] players;

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);
	
	ArrayList<Integer> listSnake = new ArrayList<Integer>();
	ArrayList<Integer> listLadder = new ArrayList<Integer>();
	ArrayList<Integer> trackPlayer1 = new ArrayList<Integer>();
	ArrayList<Integer> trackPlayer2 = new ArrayList<Integer>();

	Status1 status1 = Status1.CONTINUE;
	Status2 status2 = Status2.CONTINUE;
	
	

System.out.println("boardSize");
B = input.nextInt();
setArray(B);
System.out.println("no of players");
P = input.nextInt();
players = new int[P];
System.out.println("print no of snake head towards tail");
S = input.nextInt();
System.out.print("snake moves");
inputted = input2.nextLine();

String [] token1 = inputted.split(" ");

for(String inpus: token1) {
listSnake.add(Integer.parseInt(inpus));	

}
listSnake.toArray();

System.out.println(listSnake);
//TODo for the snake here
//where shall should be 
//must find

int [] arraySnakeHere = new int [listSnake.size()/4];
int [] arraySnakeGoTo = new int [listSnake.size()/4];

//saves where ladder goes to and where its coming from
for(int c =0;c<listSnake.size()/4;c++) {
	
arraySnakeHere[c]=board[listSnake.get(c+1)-1][listSnake.get(c)-1];
arraySnakeGoTo[c] = board[listSnake.get(c+3)-1][listSnake.get(c+2)-1];

}// end for

System.out.println(arraySnakeHere[0]);
System.out.println(arraySnakeGoTo[0]);


//**********************************ladder change***************

// working on the ladder
System.out.println("print no of ladder head towards tail");
L = input.nextInt();


System.out.print("ladder direction");
inputtedLadder = input2.nextLine();


String [] token2 = inputtedLadder.split(" ");

for(String inpus: token2) {
listLadder.add(Integer.parseInt(inpus));	
}

System.out.println(listLadder);
// to get the number it corresponds to 
listLadder.toArray();
// where shall should be 
// must find
int [] arrayLadderHere = new int [listLadder.size()/4];
int [] arrayLadderGoTo = new int [listLadder.size()/4];

// saves where ladder goes to and where its coming from
for(int c =0;c<listLadder.size()/4;c++) {
	
	arrayLadderHere[c]=board[listLadder.get(c+1)-1][listLadder.get(c)-1];
	arrayLadderGoTo[c] = board[listLadder.get(c+3)-1][listLadder.get(c+2)-1];

	}// end for

System.out.println(arrayLadderHere[0]);
System.out.println(arrayLadderGoTo[0]);




//TODo for ladder here
// roll from 1 to ...........................the kth no
System.out.println("K for the no of roll");
K = input.nextInt();
int d =0;

while(d<K) {

	
String inputRoll = input2.nextLine();
String  []token3 = inputRoll.split(" ");


if(status1 == status1.WON) {
	
	for(String inpuss: token3) {
		trackPlayer2.add(Integer.parseInt(inpuss));
		trackPlayer2.toArray();

		}// end for

		combinedPlayer2 +=trackPlayer2.get(0)+ trackPlayer2.get(1);
		System.out.println("sum"+ combinedPlayer2);

		for(int go =0;go<arrayLadderHere.length;go++) {
		if(combinedPlayer2 == arrayLadderHere[go])
			combinedPlayer2 = arrayLadderGoTo[go];
		else 
			if(combinedPlayer2 == arraySnakeHere[go])
				combinedPlayer2 = arraySnakeGoTo[go];
		}// end for

		trackPlayer2.removeAll(trackPlayer2);// remove element form player1

		System.out.println("sum"+ combinedPlayer2);

	
	
}
else if(status2 == status2.WON) {

	for(String inpuss: token3) {
trackPlayer1.add(Integer.parseInt(inpuss));
trackPlayer1.toArray();

}// end for
combinedPlayer1 +=trackPlayer1.get(0)+ trackPlayer1.get(1);
System.out.println("sum"+ combinedPlayer1);

for(int go =0;go<arrayLadderHere.length;go++) {
if(combinedPlayer1 == arrayLadderHere[go])
combinedPlayer1 = arrayLadderGoTo[go];

else if(combinedPlayer1 == arraySnakeHere[go])
combinedPlayer1 = arraySnakeGoTo[go];
} // end for


System.out.println("sum"+ combinedPlayer1);
trackPlayer1.removeAll(trackPlayer1);// remove element form player1
	
}
else
if((d%2)==0) {
	

		for(String inpuss: token3) {
trackPlayer1.add(Integer.parseInt(inpuss));
trackPlayer1.toArray();

}// end for
combinedPlayer1 +=trackPlayer1.get(0)+ trackPlayer1.get(1);
System.out.println("sum"+ combinedPlayer1);

for(int go =0;go<arrayLadderHere.length;go++) {
if(combinedPlayer1 == arrayLadderHere[go])
	combinedPlayer1 = arrayLadderGoTo[go];

else if(combinedPlayer1 == arraySnakeHere[go])
	combinedPlayer1 = arraySnakeGoTo[go];
} // end for


System.out.println("sum"+ combinedPlayer1);
trackPlayer1.removeAll(trackPlayer1);// remove element form player1

if(combinedPlayer1 >= 17) {
status1 = status1.WON;



}

}// end if



else {


for(String inpuss: token3) {
trackPlayer2.add(Integer.parseInt(inpuss));
trackPlayer2.toArray();

}// end for

combinedPlayer2 +=trackPlayer2.get(0)+ trackPlayer2.get(1);
System.out.println("sum"+ combinedPlayer2);

for(int go =0;go<arrayLadderHere.length;go++) {
if(combinedPlayer2 == arrayLadderHere[go])
	combinedPlayer2 = arrayLadderGoTo[go];
else 
	if(combinedPlayer2 == arraySnakeHere[go])
		combinedPlayer2 = arraySnakeGoTo[go];
}// end for





trackPlayer2.removeAll(trackPlayer2);// remove element form player1

System.out.println("sum"+ combinedPlayer2);

if(combinedPlayer1 >= 17) {
System.out.println("2 winner");	
status2= status2.WON;
}


}

d++;




}/// end while
	
}// end main



private static void setArray(int getSize) {
int a =0;
	board = new int [getSize][getSize];

	int index=getSize*getSize+1;	
	int index2=getSize*getSize-getSize+1;	

	
	for(int j=getSize-1;j>=0;j--) {
	for(int i =0;i<board[j].length;i++) {
   if((j+1)%2==0) {
  board[j][i] =--index;   
	   }
   else
	   board[j][i]= index2++;
		   
	 	   }
	
   if((j+2)%2==0) {
	 index-=getSize;
	    index2-=getSize*2;
 
   }
	 else
    index2-=getSize;

	
	System.out.println();
	}
	
	for(int j=getSize-1;j>=0;j--) {
	for(int i =0;i<board.length;i++) {
		System.out.printf("%-2d ",board[j][i]);
	}	
	
	System.out.println();
	
	}
	System.out.print(board[getSize-1][getSize-1]);
		
	
}
}




