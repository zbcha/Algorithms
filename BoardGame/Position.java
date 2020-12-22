//Bochao Zhang
//B00748967
//CSCI2110-Assignment1
public class Position{
  public int xor;
  public int yor;
  //Constructor
  public Position(){}
  public Position(int x,int y){
    xor=x;
    yor=y;
  }
  public void setXcor(int x){xor=x;}
  public void setYcor(int y){yor=y;}
  public int getXcor(){return xor;}
  public int getYcor(){return yor;}
  //Legalize
  public boolean noLegal(){
    if(xor>0 && xor <=8 && yor >0 && yor<=8){
      return false;
    }else{
      return true;
    }
  }
  //equals
  public boolean equal(Position p){
    if(getXcor()==(p.getXcor()) && getYcor()==(p.getYcor())){
      return true;
    }else{
      return false;
    }
  }
  public String toString(){
    return "["+xor+","+yor+"]";
  }
}