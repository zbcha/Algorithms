//Bochao Zhang
//B00748967
//CSCI2110-Assignment1
public class FastFlexible extends FastPiece{
  //Constructor
  public FastFlexible(){}
  public FastFlexible(String n,String c,Position p){
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
    }else if(dect.equals("up")){
      getPosition().setYcor(getPosition().getYcor()-n);
      if(getPosition().noLegal()){
        getPosition().setYcor(getPosition().getYcor()+n);
        System.out.println("Move not leagal");
      }
    }else if(dect.equals("down")){
      getPosition().setYcor(getPosition().getYcor()+n);
      if(getPosition().noLegal()){
        getPosition().setYcor(getPosition().getYcor()-n);
        System.out.println("Move not leagal");
      }
    }
  }
  //toString
  public String toString(){
    String r=getName()+getColor()+"FF";
    //for (int i=0;i+(r.length())<13;i++){
      //r=r+" ";
    //}
    return r;
  }
}