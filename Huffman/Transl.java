public class Transl{
    private char value;
    private String id;
//constructor
    public Transl(){}
    public Transl(char a,String p){
        value=a;
        id=p;
    }
//getters
    public char getValue(){ return value;}
    public String getId(){ return id;}
//setters
    public void setValue(char a) { value=a;}
    public void setId(String p) { id=p;}
//toString
    public String toString(){
       return value+"\t"+id;
    }
}