//Bochao Zhang
//B00748967
//CSCI2110-Assignment1
public class SlowPiece extends Piece{
  //Constructor
  public SlowPiece(){}
  public SlowPiece(String n,String c,Position p){
    setName(n);
    setColor(c);
    setPosition(p);
  }
  //moving method
  public void move(String dect){
    if(dect.equals("left")){
      getPosition().setXcor(getPosition().getXcor()-1);
      if(getPosition().noLegal()){
        getPosition().setXcor(getPosition().getXcor()+1);
        System.out.println("Move not leagal");
      }
    }else if(dect.equals("right")){
      getPosition().setXcor(getPosition().getXcor()+1);
      if(getPosition().noLegal()){
        getPosition().setXcor(getPosition().getXcor()-1);
        System.out.println("Move not leagal");
      }
    }
  }
  //toString
  public String toString(){
    return getName()+getColor()+"S";
  }
}