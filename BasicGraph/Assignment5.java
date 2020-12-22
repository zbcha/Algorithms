//Bochao Zhang
//B00748967
//CSCI2110 Assignment5
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.text.ParseException;

public class Assignment5{
    public static void main(String[] args) throws IOException{
        Scanner keyboard = new Scanner(System.in);
		  System.out.print("@File read from \'Graph.txt\'\n");
   
        File file = new File("Graph.txt");
		  Scanner inputFile = new Scanner(file);
        String usrIn;
        int size = inputFile.nextInt();
        ArrayList util=new ArrayList<String>();
        int adj[][]=new int[size][size];
                
        while (inputFile.hasNext()){
            usrIn = inputFile.nextLine();
            String[] read = usrIn.split("\t",2);
            for(int i=0;i<read.length;i++){
                if(!util.contains(read[i]) && !read[i].equals("")) util.add(read[i]);   
            }
            if(read.length==2){
                adj[fiNum(read[0])][fiNum(read[1])]=1;               
                adj[fiNum(read[1])][fiNum(read[0])]=1;
            }
        }
        Collections.sort(util); 
        System.out.println("Adjacency Matrix:");
        display(adj,util); 
        breadthFirst(adj,util);
        depthFirst(adj,util);   
    }
    
    public static int fiNum(String in){
        if(in.equals("A")) return 0;
        else if(in.equals("B")) return 1;
        else if(in.equals("C")) return 2;
        else if(in.equals("D")) return 3;
        else return 4;
    }
    
    public static void display(int[][] ar,ArrayList kp){
        System.out.println(" "+kp);
        for(int i=0;i<ar.length;i++){
            System.out.print(kp.get(i));
            for(int j=0;j<ar[i].length;j++){
                System.out.print(" "+ar[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    
    public static void breadthFirst(int[][] ar,ArrayList kp){
        ArrayList temp=new ArrayList<String>();
        System.out.println("Breadth-first traversal:\n"+kp.get(0)+" Visited!");
        temp.add(kp.get(0));
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                if(ar[i][j]==1 && !temp.contains(kp.get(j))){
                    System.out.println(kp.get(j)+" Visited!");
                    temp.add(kp.get(j));
                }
            }
        }
    }
    
    public static void depthFirst(int[][] ar,ArrayList kp){
        ArrayList temp=new ArrayList<String>();
        System.out.println("Depth-first traversal:\n"+kp.get(0)+" Visited!");
        temp.add(kp.get(0));
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                if(ar[i][j]==1 && !temp.contains(kp.get(j))){
                    System.out.println(kp.get(j)+" Visited!");
                    i=j-1;
                    temp.add(kp.get(j));
                }
            }
        }
    }
}