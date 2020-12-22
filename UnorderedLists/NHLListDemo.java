//Bochao Zhang
//B00748967
//CSCI2110
//Assignment2 Exercise1
import java.util.Scanner;
import java.io.*;

public class NHLListDemo{
    public static void main(String[] args) throws IOException{
      Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the filename to read from: ");
		String filename = keyboard.nextLine();
   
      File file = new File(filename);
		Scanner inputFile = new Scanner(file);
      
      NHLStats nhl = new NHLStats();
      String usrIn;
      String a,b,c,d,e,f,g,h,o;
		PlayerRecord pr=null;
      
      while (inputFile.hasNext()){
         usrIn = inputFile.nextLine();
         //Test:System.out.println(usrIn);
         String[] read = usrIn.split("\t\t|\t",9);
         //Test:
         //for(int i=0;i<9;i++)
         //    System.out.println(read[i]);
			//TestEnd
         a = read[0];
			b = read[1];
			c = read[2];
         d = read[3];
         e = read[4];
         f = read[5];
         g = read[6];
         h = read[7];
         o = read[8];
         int dd = Integer.valueOf(d);
         int ee = Integer.valueOf(e); 
         int ff = Integer.valueOf(f); 
         int gg = Integer.valueOf(g); 
         int hh = Integer.valueOf(h); 
         int oo = Integer.valueOf(o);  
         //Test:System.out.println(rr);
			pr = new PlayerRecord(a,b,c,dd,ee,ff,gg,hh,oo);
			nhl.addPlayer(pr);
		}      
      inputFile.close();
      //Test:nhl.playerDisplay();
      //Test:nhl.teamDisplay();
      System.out.println("\n"+"Player with  highest points:\n"+nhl.mostPoint());
      System.out.println("Most aggresive player:\n"+nhl.mostPenalty());
      System.out.println("Most Valuble Player:\n"+nhl.findMVP());
      System.out.println("Most Promising Player:\n"+nhl.promisingPlayer());
      System.out.println("Team with the most Penalty:");
      nhl.teamPenalty();
      System.out.println("\nTeam with the most Winning Goals: ");
      nhl.teamWin();
    }
}