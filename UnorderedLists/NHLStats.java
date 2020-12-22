//Bochao Zhang
//B00748967
//CSCI2110-Assignment2
//Exercise 1
public class NHLStats{
    private List<PlayerRecord> players;
    private List<String> teams;
    
    public NHLStats(){
        players=new List<PlayerRecord>();
        teams=new List<String>();
    }
    public void addPlayer(PlayerRecord p){
        players.add(p);
        if(teams.contains(p.getTeam())==false)
           teams.add(p.getTeam());
    }
    //Following functioning methods
    public String mostPoint(){
        int max =0, amt;
        String r="";
		  PlayerRecord pr = players.first();
		  while (pr!=null){
			   amt = pr.getGoalScored()+pr.getAssists();
			   if (amt>max){
			       max = amt;
            }
			   pr = players.next();
		  }
        players.reset();
        pr = players.first();
        while (pr!=null){
			   amt = pr.getGoalScored()+pr.getAssists();
			   if (amt==max){
                r+=pr.getName()+" "+pr.getTeam()+"\n";
            }
			   pr = players.next();
		  }
        return r;
    }
    //Most Penalty
    public String mostPenalty(){
        int max =0, amt;
        String r="";
		  PlayerRecord pr = players.first();
		  while (pr!=null){
			   amt = pr.getPenalty();
			   if (amt>max){
			       max = amt;
            }
			   pr = players.next();
		  }
        players.reset();
        pr = players.first();
        while (pr!=null){
			   amt = pr.getPenalty();
			   if (amt==max){
                r+=pr.getName()+" "+pr.getPosition()+" "+pr.getTeam()+"\n";
            }
			   pr = players.next();
		  }
        return r;
    }
    // find MVP
    public String findMVP(){
        int max =0, amt;
        String r="";
		  PlayerRecord pr = players.first();
		  while (pr!=null){
			   amt = pr.getGameWin();
			   if (amt>max){
			       max = amt;
            }
			   pr = players.next();
		  }
        players.reset();
        pr = players.first();
        while (pr!=null){
			   amt = pr.getGameWin();
			   if (amt==max){
                r+=pr.getName()+" "+pr.getTeam()+"\n";
            }
			   pr = players.next();
		  }
        return r;
    }
    //Promising Player
    public String promisingPlayer(){
        int max =0, amt;
        String r="";
		  PlayerRecord pr = players.first();
		  while (pr!=null){
			   amt = pr.getShotGoal();
			   if (amt>max){
			       max = amt;
            }
			   pr = players.next();
		  }
        players.reset();
        pr = players.first();
        while (pr!=null){
			   amt = pr.getShotGoal();
			   if (amt==max){
                r+=pr.getName()+" "+pr.getTeam()+"\n";
            }
			   pr = players.next();
		  }
        return r;
    }
    //Most Penalty team
    public void teamPenalty(){
       String r="";       
       int max=0,amt=0;
       String tt=teams.first();
       PlayerRecord pr=players.first();
       while(tt!=null){
          while(pr!=null){
             if(pr.getTeam().equals(tt)){
                amt+=pr.getPenalty();
             }
             pr=players.next();
          }
          if (amt>max){
			       max = amt;
                r=tt;
          }
          amt=0;
          pr=players.first();
			 tt = teams.next();
       }
       System.out.println(r+" With a penalty of:"+max);
    }
    //Most winning goals team
    public void teamWin(){
       String r="";       
       int max=0,amt=0;
       String tt=teams.first();
       PlayerRecord pr=players.first();
       while(tt!=null){
          while(pr!=null){
             if(pr.getTeam().equals(tt)){
                amt+=pr.getGameWin();
             }
             pr=players.next();
          }
          if (amt>max){
			       max = amt;
                r=tt;
          }
          amt=0;
          pr=players.first();
			 tt = teams.next();
       }
       System.out.println(r+" With a Winning Goal of: "+max);
    }
    //Display
    public void playerDisplay(){
        PlayerRecord pr = players.first();
        while (pr!=null){
            System.out.print(pr);
            pr=players.next();
        }
    }
    public void teamDisplay(){
        String pr = teams.first();
        while (pr!=null){
            System.out.print(pr+" ");
            pr=teams.next();
        }
    }
}