//Bochao Zhang
//B00748967
//CSCI2110 Assignment2
//Exercise 2
import java.util.Scanner;
import java.io.*;

public class OrderedListDemo{
    public static void main(String[] args) throws IOException{
        Scanner keyboard = new Scanner(System.in);
		  System.out.print("Enter the first filename: ");
		  String filename1 = keyboard.nextLine();       
        System.out.print("Enter the second filename: ");
        String filename2 = keyboard.nextLine();
   
        File file1 = new File(filename1);
        File file2 = new File(filename2);
		  Scanner inputFile1 = new Scanner(file1);
        Scanner inputFile2 = new Scanner(file2);
        
        OrderedList or1=new OrderedList<String>();
        OrderedList or2=new OrderedList<String>();
        OrderedList or3=new OrderedList<String>();
        
        String usrIn="";
        while (inputFile1.hasNext()){
            usrIn = inputFile1.nextLine();
            or1.insert(usrIn);
        }
        while (inputFile2.hasNext()){
            usrIn = inputFile2.nextLine();
            or2.insert(usrIn);
        }
        //Merge
        for(int i=0;i<or1.size();i++){
            or3.insert(or1.get(i));
        }
        for(int i=0;i<or2.size();i++){
            or3.insert(or2.get(i));
        }
        System.out.println("For the following Odered Lits:\nlist1:");
        or1.enumerate();
        System.out.println("list2:");
        or2.enumerate();
        System.out.println("Merge list1 & list2: ");
        or3.enumerate();
    }
}