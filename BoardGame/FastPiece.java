//Bochao Zhang
//B00748967
//CSCI2110-Assignment1
public class FastPiece extends Piece{
  //Constructor
  public FastPiece(){}
  public FastPiece(String n,String c,Position p){
    setName(n);
    setColor(c);
    setPosition(p);
  }
  //moving method
  public void move(String dect,int n){
    if(dect.equals("left")){
      getPosition().setXcor(getPosition().getXcor()-n);
      if(getPosition().noLegal()){
        getPosition().setXcor(getPosition().getXcor()+n);
        System.out.println("Move not leagal");
      }
    }else if(dect.equals("right")){
      getPosition().setXcor(getPosition().getXcor()+n);
      if(getPosition().noLegal()){
        getPosition().setXcor(getPosition().getXcor()-n);
        System.out.println("Move not leagal");
      }
    }
  }
  //toString
  public String toString(){
    return getName()+getColor()+"F";
  }
}