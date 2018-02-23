                                                        /*HANGMAN GAME
                                                    Created By:- Varun Manchanda
                                                      50% Created till Now!
                                                            */
package Hangman;
import java.util.Random;
import java.util.Arrays;
public class Hangman{
	
static String hang(){
String[] s1 = {"ELASTICITY", "ADDICTIONS","ADJUSTABLE","ADVOCATORS"};
Random obj1 = new Random();
int x = obj1.nextInt(s1.length)+0;
return s1[x];
}	

static void display(){
	System.out.println("*******************WELCOME TO HANGMAN GAME*******************"); 
	System.out.println("                              |                              ");
    System.out.println("                              |                              ");
	System.out.println("                              |                              ");
	System.out.println("                            // \\                             ");
	System.out.println("                           //   \\                            ");
	System.out.println("                          //     \\                           ");	
}

public static void main(String[] args){

//Declarations:- 
	 int ran[] = new int[5];
	 int fan[] = new int[5];
     Random obj = new Random();
	// String arr = "ELASTICITY";
	 String name = hang();
	 char ch[] = name.toCharArray();
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



}//Main End
};//Class End