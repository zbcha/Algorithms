//Bochao Zhang
//B00748967
//CSCI2110 Assignment4
//Exercise 0
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class Exercise0{
    public static void main(String[] args){
        Scanner usr=new Scanner(System.in);
        System.out.print("Define the data size: ");
        int t=usr.nextInt();
        ArrayList<LinkedList<Integer>> table = new ArrayList<LinkedList<Integer>>(t);
        
        for(int i=0;i<t;i++){
            LinkedList<Integer> inw=new LinkedList<Integer>();
            table.add(inw);
        }
        
        System.out.print("How many numbers to generate? ");
        int n=usr.nextInt();
        for(int i=0;i<n;i++){
            int elm=((int)(10000*Math.random()))+1;
            if(contain(table,elm,t)){
                i--;
            }else{
                add(table,elm,t);
            }
        }
       
        display(table);
        System.out.println("\nStatistics: ");
        statistic(table);
    }
    
    public static boolean contain(ArrayList<LinkedList<Integer>> table,int elm,int t){
        return table.get(elm%t).contains(elm);
    }
    
    public static void add(ArrayList<LinkedList<Integer>> table,int elm,int t){
        table.get(elm%t).add(elm);
    }
    
    public static void display(ArrayList<LinkedList<Integer>> table){
        for(int i=0;i<table.size();i++){
            System.out.print(i+" -----> [");
            for(int j=0;j<table.get(i).size();j++){
                System.out.print(table.get(i).get(j)+"->");
            }
            System.out.println("]");
        }
    }
    
    public static void statistic(ArrayList<LinkedList<Integer>> table){
        System.out.println("Table size: "+table.size());
        int k=0;
        int co=0;
        int max=0;
        for(int i=0;i<table.size();i++){
            k+=table.get(i).size();
            if(table.get(i).size()>1)
                co=co+table.get(i).size()-1;
            if(table.get(i).size()>max)
                max=table.get(i).size();
        }
        double lf=k/table.size();
        System.out.println("Number of keys: "+k+"\nLoad factor: "+
        lf+"\nNumber of collision: "+co+"\nLongest list: "+max);
    }
}