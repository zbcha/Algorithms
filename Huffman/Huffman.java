//Bochao Zhang
//B00748967
//CSCI2110 Assignment 3
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Huffman{
    //Test//
    //Test//
    public static void encode() throws IOException{
        Scanner keyboard = new Scanner(System.in);
		  System.out.print("Enter the filename to read from: ");
		  String filename = keyboard.nextLine();
   
        String usrIn="";
        File file = new File(filename);
		  Scanner inputFile = new Scanner(file);
        ArrayList tras=new ArrayList<Transl>();
        
        while (inputFile.hasNext()){
            usrIn = usrIn+inputFile.nextLine();
        }
        
        int[] freq = new int[256];
        double[] prob = new double[256];
        char[] chars = usrIn.replaceAll("\\s", "").toCharArray();    
        for(char c: chars)
            freq[c]++;
        for(int i=0;i<256;i++)
            prob[i]=Math.round(freq[i]*10000d/chars.length)/10000d;
        //Add pairs
        Pair tem=new Pair();
        ArrayList pairs=new ArrayList<Pair>();
        for(int i=0;i<256;i++){
            if(prob[i]!=0){
                tem = new Pair((char)i,prob[i]);
                pairs.add(tem);                
            };
        }
        //Sort
        Collections.sort(pairs);
        //Test
        //for(int i=0;i<26;i++)
        //System.out.println(pairs.get(i));        
        //build Tree
        ArrayList trees=new ArrayList<BinaryTree<Pair>>();
        ArrayList pres=new ArrayList<BinaryTree<Pair>>();
        for(int i=0;i<pairs.size();i++){
            BinaryTree tf=new BinaryTree<Pair>();
            tf.makeRoot(pairs.get(i));
            trees.add(tf);
        }
        
        while(!trees.isEmpty()){
            if(pres.isEmpty()){
                BinaryTree p = new BinaryTree<Pair>();
                Pair tp=new Pair((char)37,((Pair)((BinaryTree<Pair>)(trees.get(0))).getData()).getProb()+
                ((Pair)((BinaryTree<Pair>)(trees.get(1))).getData()).getProb());
                p.makeRoot(tp);
                p.attachLeft((BinaryTree<Pair>)(trees.get(0)));
                p.attachRight((BinaryTree<Pair>)(trees.get(1)));
                trees.remove(0);
                trees.remove(1);
                pres.add(p);
            }else if(pres.size()==1){
                BinaryTree p = new BinaryTree<Pair>();
                Pair tp=new Pair((char)37,((Pair)((BinaryTree<Pair>)(trees.get(0))).getData()).getProb()+
                ((Pair)((BinaryTree<Pair>)(pres.get(0))).getData()).getProb());
                p.makeRoot(tp);
                if(((Pair)((BinaryTree<Pair>)(trees.get(0))).getData()).getProb()<((Pair)((BinaryTree<Pair>)(pres.get(0))).getData()).getProb()){
                    p.attachLeft((BinaryTree<Pair>)(trees.get(0)));
                    p.attachRight((BinaryTree<Pair>)(pres.get(0)));
                }else{
                    p.attachLeft((BinaryTree<Pair>)(pres.get(0)));
                    p.attachRight((BinaryTree<Pair>)(trees.get(0)));
                }
                trees.remove(0);
                pres.remove(0);
                pres.add(p);
            }else if(pres.size()>1){
                BinaryTree p = new BinaryTree<Pair>();
                Pair tp=new Pair((char)37,((Pair)((BinaryTree<Pair>)(pres.get(0))).getData()).getProb()+
                ((Pair)((BinaryTree<Pair>)(pres.get(1))).getData()).getProb());
                p.makeRoot(tp);
                p.attachLeft((BinaryTree<Pair>)(pres.get(0)));
                p.attachRight((BinaryTree<Pair>)(pres.get(1)));
                pres.remove(0);
                pres.remove(1);
                pres.add(p);
            }
        }       
        findEncoding((BinaryTree<Pair>)(pres.get(0)),"0",tras);
        System.out.println("Encoding Output:");
        for(int i=0;i<chars.length;i++){
            for(int j=0;j<tras.size();j++){
               if(chars[i]==((Transl)(tras.get(j))).getValue()){
                   
                   System.out.println(((Transl)(tras.get(j))).getId());
               }
            }
        }
    }
    
    
    private static void findEncoding(BinaryTree<Pair> bt,String p,ArrayList<Transl> tras) throws IOException{
        if (bt!=null){
	         findEncoding(bt.getLeft(),p+"0",tras);
            if(bt.getData().getValue()!=(char)37)
		          System.out.println(bt.getData() + "\t"+p);
                Transl tl = new Transl( ((Pair) (bt.getData()) ).getValue() ,p);
                tras.add(tl);
		      findEncoding(bt.getRight(),p+"1",tras);
		  }
    }
    
    
}