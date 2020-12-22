//Bochao Zhang
//B00748967
//CSCI2110-Assignment1
import java.util.*;
public class Board{
  private ArrayList<Piece> Board;
  //Constructor
  public Board(){
    Board = new ArrayList<Piece>();
    for(int i=1;i<9;i++){
      for(int j=1;j<9;j++){
        Position pos=new Position(j,i);
        Piece pi=new Piece("-","",pos);
        Board.add(pi);
      }
    }
  }
  //getter
  public Piece get(int i){
    return Board.get(i);
  }
  //add pieces
  public void add(Piece pi){
    int id=0;
    for(int i=0;i<64;i++){
      if( ((Position)((Piece)Board.get(i)).getPosition()).equal(((Position)pi.getPosition())) && ((String)((Piece)Board.get(i)).getName()).equals("-")){
        Board.set(i,pi);
        id=1;
        break;
      }
    }
    if(id==0)
      System.out.println("A unvalid position");
  }
  //Remove
  public void remove(Piece pi){
    Piece nothing;
    for(int i=0;i<64;i++){
      if( (""+(Board.get(i))).equals(""+(pi)) ){
        nothing = new Piece("-","",((Piece)Board.get(i)).getPosition());
        Board.set(i,nothing);
      }
    }
  }
  //Moving method
  public void move(Piece pi){
    int id=0;
    for(int i=0;i<64;i++){
      if( ((Position)((Piece)Board.get(i)).getPosition()).equal(((Position)pi.getPosition())) && ((String)((Piece)Board.get(i)).getName()).equals("-")){
        remove(pi);
        add(pi);
        id=1;
        //break;
      }
    }
    if(id==0)
      System.out.println("This move is not legal!");
  }
  //Display the Board
  public void display(){
    for(int i =0;i<64;i++){
        System.out.print(Board.get(i));
        for(int j=0;j+(""+Board.get(i)).length()<14;j++){
          System.out.print(" ");
        }
        if((i+1)%8==0)
          System.out.print("\n");
    } 
  }
}