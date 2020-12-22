//Bochao Zhang
//B00748967
//CSCI2110-Assignment1
public class Piece{
  //Initialize the varibles
  private String name;
  private String color;
  private Position pos;
  //Constructor
  public Piece(){}
  public Piece(String n,String c,Position p){
    name=n;
    color=c;
    pos = p;
  }
  //Getters & Setters
  public String getName(){return name;}
  public String getColor(){return color;}
  public Position getPosition(){return pos;}
  public void setName(String n){name=n;}
  public void setColor(String c){color=c;}
  public void setPosition(Position p){pos=p;}
  //to String method
  public String toString(){
    String r=getName()+getColor();
    //for (int i=0;i<13;i++){
      //r=r+" ";
    //}
    return r;
  }
}