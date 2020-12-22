public class Pair implements Comparable<Pair>{
// declare all required fields
    private char value;
    private double prob;
//constructor
    public Pair(){}
    public Pair(char a,double p){
        value=a;
        prob=p;
    }
//getters
    public char getValue(){ return value;}
    public double getProb(){ return prob;}
//setters
    public void setValue(char a) { value=a;}
    public void setProb(double p) { prob=p;}
//toString
    public String toString(){
       return value+"\t"+prob;
    }
/**
The compareTo method overrides the compareTo method of the
Comparable interface.
*/
@Override
    public int compareTo(Pair p){
        return Double.compare(this.getProb(), p.getProb());
    }
}