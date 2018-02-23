                                                        /*HANGMAN GAME
                                                    Created By:- Varun Manchanda
                                                          100% Created!!
                                                            */
package Hangman;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Hangman{
	
static String hang(){
String[] s1 = {"ELASTICITY", "ADDICTIONS","ADJUSTABLE","ADVOCATORS", "CONGRATULATION", "BACKBENCHERS", "NEVADA"};
Random obj1 = new Random();
int x = obj1.nextInt(s1.length)+0;
return s1[x];
}	

static void display(){
	System.out.println("*******************WELCOME TO HANGMAN GAME*******************");
	System.out.println("                         (  @   @   )                        ");
	System.out.println("                              |                              ");
    System.out.println("                    ------    |   ------                     ");
	System.out.println("                              |                              ");
	System.out.println("                            // \\                             ");
	System.out.println("                           //   \\                            ");
	System.out.println("                          //     \\                           ");	
}

static void display1(){
	System.out.println("***************************THE END***************************"); 
}

public static void main(String[] args){

//Declarations:- 
	 int ran[] = new int[5];
	 int fan[] = new int[5];
     Random obj = new Random();
	// String arr = "ELASTICITY";
	 String name = hang();
	 char ch[] = name.toCharArray();
	 char w;
	 char game[] = new char[4];
	 int total = 0;
	 Scanner word = new Scanner(System.in);
//Initialization:-     
     int max = 5;
	 int temp=0, l=0;
	 ran[0] = obj.nextInt(10)+0;
     fan[0] = ran[0];

//For Generating Random Numbers:-
     for(int i=0; i<5; i++){
     ran[i] = obj.nextInt(10)+0;
     for(int j=0; j<=i; j++){
     if(fan[j]==ran[i]){
     i--;
     break;
     }
     }
	 if(i==-1)
	 continue;
     fan[i] = ran[i];
     }
 //Sorting Elements inside Array:-
Arrays.sort(fan);

/*For Testing Purpose:-
for(int i=0; i<5; i++){
	System.out.println(fan[i]);
}
*/
display();
//For Creating the Question:-
for(int j=0; j<ch.length; j++){
	if(fan[temp]==j && temp<4){
		System.out.print(" _ ");
		temp++;
	}
	else{
		System.out.print(" "+ch[j]);
	}
		
}
//START THE GAME:-

for(l=0; l<4; l++){
	for(int i=l; i<=l; i++){
		game[l] = name.charAt(fan[i]);
	}
}
/*Testing Purpose:-
System.out.println("Words are:-");
for(int i=0; i<4; i++){
	System.out.println(game[i]);
}
*/
//Calculation Begins:-
String t;
System.out.println("");
System.out.println("Now Guess The Missing Letters");
for(int i=0; i<4; i++){
	System.out.println("Enter the "+(i+1)+" Letter");
	t = word.next();
	w = t.charAt(0);
	if(game[i]==w){
		total += 5;
	//System.out.println("total is "+total);	
	System.out.println("Right Answer word is "+game[i]);
	
		continue;
	}
	else{
		total -= 2;
		System.out.println("Wrong Answer, try Again");
		i--;
	}
	
}
if(total==20){
	System.out.println("Congratulation's you Win! and the Words is "+name);
	display1();
}
else{
	System.out.println("Your Total Score is "+total);
	System.out.println("Better Luck Next Time");
	display1();
}



}//Main End
};//Class End