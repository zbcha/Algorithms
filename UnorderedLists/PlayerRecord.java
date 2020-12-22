//Bochao Zhang
//B00748967
//CSCI2110
//Assignment2 Exercise1
public class PlayerRecord{
    private String name;
    private String position;
    private String team;
    private int gamePlayed;
    private int goalScored;
    private int assists;
    private int penalty;
    private int shotGoal;
    private int gameWin;
   
    public PlayerRecord(String n,String p,String t,int gp,int gs,int a,int pe,int sg,int gw){
        name=n;
        position=p;
        team=t;
        gamePlayed=gp;
        goalScored=gs;
        assists=a;
        penalty=pe;
        shotGoal=sg;
        gameWin=gw;  
    }
    public String dTeam(){
        return team+" "+gamePlayed+" "+goalScored+" "+assists+" "+penalty+" "+shotGoal+" "+gameWin+"\n";
    }
    
    public String toString(){
        return name+" "+position+" "+team+" "+gamePlayed+" "+goalScored+" "+assists+" "+penalty+" "+shotGoal+" "+gameWin+"\n";
    }
    //Getters
    public String getName(){ return name;}
    public String getPosition(){ return position;}
    public String getTeam(){ return team;}
    public int getGamePlayed(){ return gamePlayed;}
    public int getGoalScored(){ return goalScored;}
    public int getAssists(){ return assists;}
    public int getPenalty(){ return penalty;}
    public int getShotGoal(){ return shotGoal;}
    public int getGameWin(){ return gameWin;}
    //Setters
    public void addGamePlayed(int gp){ gamePlayed+=gp;}
    public void addGoalScored(int gs){ goalScored+=gs;}
    public void addAssists(int a){ assists+=a;}
    public void addPenalty(int pe){ penalty+=pe;}
    public void addShotGoal(int sg){ shotGoal+=sg;}
    public void addGameWin(int gw){ gameWin+=gw;}
}