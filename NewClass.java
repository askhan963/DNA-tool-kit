/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bioproject;

import java.util.Scanner;
public class NewClass {
public static void main(String[]args){
    System.out.println("ENTER DNA SEQUENCE");
    Scanner input = new Scanner(System.in);
    String DNA = input.nextLine();
    DNA = DNA.toUpperCase();
    int length = DNA.length();
    String complement;
complement = DNA.replaceAll("A","X");
complement = complement.replaceAll("T","A");
complement = complement.replaceAll("X","T");

complement = complement.replaceAll("C","X");
complement = complement.replaceAll("G","C");
complement = complement.replaceAll("X","G");

System.out.println("Complement:"+complement);
String RNA = complement.replaceAll("T","U");
System.out.println("RNA sequence:"+RNA);

    
    System.out.println("OPEN READING FRAMES");
    System.out.println("Frame 1 :"+DNA);
    translation(DNA.replaceAll("T", "U"));
    String Frame2 =DNA.substring(1,length);
    System.out.println("\nFrame 2 :"+Frame2);
    translation(Frame2.replaceAll("T", "U"));
    String Frame3 =DNA.substring(2,length);
    System.out.println("\nFrame 3 :"+Frame3);
    translation(Frame3.replaceAll("T", "U"));
    String Frame4 =RNA;
    StringBuilder Frame41 = new StringBuilder();
    Frame41.append(Frame4);
    Frame41.reverse();
    Frame4 = Frame41.toString();
    System.out.println("\nFrame 4 :"+Frame41);
    translation(Frame4);
    String Frame5 =Frame4;
    Frame5 =Frame4.substring(1,length);
    System.out.println("\nFrame 5 :"+Frame5);
    translation(Frame5);
    String Frame6 =Frame4;
  
    Frame6 =Frame4.substring(2,length);
    System.out.println("\nFrame 6 :"+Frame6);
    translation(Frame6);
    System.out.println("");
    
}    
static void translation(String sequence){
char[] s = new char[sequence.length()];

for (int j= 0; j < sequence.length(); j++) {
            s[j] = sequence.charAt(j);
        }
for(int i=0;i<=sequence.length();i=i+3){
    if(i+3>sequence.length()){break;}
	//First Base U
	if(s[i]=='U'){
	    if(s[i+1]=='U'){
		    if(s[i+2]=='U'|| s[i+2]=='C'){
			System.out.printf("F");}
            else if(s[i+2]=='A'|| s[i+2]=='G'){
			System.out.printf("L");}
		}

	    else if(s[i+1]=='C'){
	    	if(s[i+2]=='U'|| s[i+2]=='C' || s[i+2]=='A' || s[i+2]=='G'){
	    	System.out.printf("S");}
		}
		else if(s[i+1]=='A'){
	        if(s[i+2]=='U'|| s[i+2]=='C'){
	        System.out.printf("Y");}
	        else if(s[i+2]=='A' || s[i+2]=='G'){
	         System.out.printf("*");}	
			}
		else if(s[i+1]=='G'){
	        if(s[i+2]=='U'|| s[i+2]=='C'){
	        System.out.printf("C");}
	        else if(s[i+2]=='A' || s[i+2]=='G'){
	         System.out.printf("*");}
                
			}
               
		}
	//First Base C
	else if(s[i]=='C'){
	    if(s[i+1]=='U'){
		    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
			System.out.printf("L");}	
	    }
	    else if(s[i+1]=='C'){
		    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
			System.out.printf("P");}	
	    }
	    else if(s[i+1]=='A'){
	    	if(s[i+2]=='U'|| s[i+2]=='C'){
	    	System.out.printf("H");}
	    	else if(s[i+2]=='A' || s[i+2]=='G'){
	    	System.out.printf("Q");}
		}
		
		else if(s[i+1]=='G'){
		    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
			System.out.printf("R");}			

        }
    }
        //First Base A
	else if(s[i]=='A'){
	    if(s[i+1]=='U'){
		    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A' ){
			System.out.printf("I");}	
		    else if(s[i+2]=='G'){
			System.out.printf("M");}
	    }
	    else if(s[i+1]=='C'){
	    	if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
	    	System.out.printf("T");}

		}
		
		else if(s[i+1]=='A'){
		    if(s[i+2]=='U'|| s[i+2]=='C'){
	    	System.out.printf("N");}
	    	else if(s[i+2]=='A' || s[i+2]=='G'){
	    	System.out.printf("K");}		

        }
        else if(s[i+1]=='G'){
		    if(s[i+2]=='U'|| s[i+2]=='C'){
	    	System.out.printf("S");}
	    	else if(s[i+2]=='A' || s[i+2]=='G'){
	    	System.out.printf("R");}		

        }
    }
        //First Base G
	else if(s[i]=='G'){
	    if(s[i+1]=='U'){
	    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
	    	System.out.printf("V");}
	    }
	    else if(s[i+1]=='C'){
	    	if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
	    	System.out.printf("A");}

		}
		else if(s[i+1]=='A'){
		    if(s[i+2]=='U'|| s[i+2]=='C'){
	    	System.out.printf("D");}
	    	else if(s[i+2]=='A' || s[i+2]=='G'){
	    	System.out.printf("E");}		

        }
        else if(s[i+1]=='G'){
		    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
	    	System.out.printf("G");}	

        }
	}
	
	
	
}//FOR LOOP

}
 
}
