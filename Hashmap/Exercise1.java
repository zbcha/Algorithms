//Bochao Zhang
//B00748967
//CSCI2110 Assignment4
//Exercise 1
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class Exercise1{
    public static void main(String[] args) throws IOException{
        Scanner keyboard = new Scanner(System.in);
		  System.out.print("@File read from \'Students.txt\'\n");
   
        File file = new File("Students.txt");
		  Scanner inputFile = new Scanner(file);
        String usrIn;
        HashMap hm1=new HashMap();
        HashMap hm2=new HashMap();
        
        while (inputFile.hasNext()){
            usrIn = inputFile.nextLine();
            String[] read = usrIn.split("\t",3);
            hm1.put(read[1],read[2]);
            hm2.put(read[1],read[0]);
        }
                
        for(int i=0;i<3;i++){
            System.out.print("Login: ");
            String un=keyboard.nextLine();
            System.out.print("Password: ");
            String ps=keyboard.nextLine();
            if( ps.equals(hm1.get(un)) ){
                System.out.println("Welcome! "+hm2.get(un));
                break;
            }else{
                if(i==0) System.out.println("Wrong password! You have 2 more attempts!");
                else if(i==1) System.out.println("Wrong password! You have 1 more attempt!");
                else if(i==2) System.out.println("Wrong password! Login failed!");
            }
        }
    }
}