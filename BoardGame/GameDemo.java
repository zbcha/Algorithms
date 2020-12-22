//Bochao Zhang
//B00748967
//CSCI2110-Assignment1
import java.util.*;
public class GameDemo{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Board bd=new Board();
    while(true){
      System.out.println("Enter a command: (type help for details)");
      String usr=sc.next();
      if(usr.equals("quit"))//////////Quit the game
        break;
      if(usr.equals("help"))//////////Help Command
        System.out.println("create location [Fast][Flexible]: Creates a new piece.\nmove location direction [spaces]: Moves a piece.\nprint: Displays the board.\nhelp: Displays help.\nquit: Exits the program.");
      if(usr.equals("create")){//Creat Pieces
        int usrx=sc.nextInt();
        int usry=sc.nextInt();
        String usr1=sc.next();
        String usr2=sc.next();
        Position pos = new Position (usrx,usry);
        if(usr1.equals("Slow") && usr2.equals("Piece")){//Distinguish the Piece
          System.out.println("Name your Piece with a name and a color: ");
          String usr3=sc.next();
          String usr4=sc.next();
          SlowPiece sp=new SlowPiece(usr3,usr4,pos);
          bd.add(sp);
        }else if(usr1.equals("Slow") && usr2.equals("Flexible")){
          System.out.println("Name your Piece with a name and a color: ");
          String usr3=sc.next();
          String usr4=sc.next();
          SlowFlexible sf=new SlowFlexible(usr3,usr4,pos);
          bd.add(sf);
        }else if(usr1.equals("Fast") && usr2.equals("Piece")){
          System.out.println("Name your Piece with a name and a color: ");
          String usr3=sc.next();
          String usr4=sc.next();
          FastPiece fp=new FastPiece(usr3,usr4,pos);
          bd.add(fp);
        }else if(usr1.equals("Fast") && usr2.equals("Flexible")){
          System.out.println("Name your Piece with a name and a color: ");
          String usr3=sc.next();
          String usr4=sc.next();
          FastFlexible ff=new FastFlexible(usr3,usr4,pos);
          bd.add(ff);
        }
      }
      if(usr.equals("move")){//The move method
        String usr1=sc.next();
        String usr2=sc.next();
        int usri=sc.nextInt();
        for(int i = 0;i<64;i++){//Scan all the pieces to remove first and add
          if( (""+bd.get(i)).equals(usr1) ){
            FastFlexible ne = (FastFlexible)bd.get(i);
            ne.move(usr2,usri);
            bd.move(ne);
          }
        }
      }
      if(usr.equals("print")){
        bd.display();
      }
    }
  }      
}