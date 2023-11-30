public class Taxi {
    private static int count =1;
    private final int ID;
    private char location;
    private int earning;
    private int freeTime;
    public Taxi(){
        this.ID=count;
        count++;
        this.location='A';
        this.earning=0;
        this.freeTime=6;
    }

    public String toString(){
        return "ID: "+this.ID+" location: "+this.location+" Earnings: "+this.earning+" Freetime: "+this.freeTime;
    }
    public int getId(){
        return this.ID;
    }
    public char getLocation(){
        return this.location;
    }
    public int getEarning(){
        return this.earning;
    }
    public int getFreeTime(){
        return this.freeTime;
    }
    public void updateLocation(char curlocation){
        this.location=curlocation;
    }
    public void updateEarning(int amount){
        this.earning=this.earning+amount;
    }
    public void updateFreeTime(int travelTime){
        this.freeTime=this.freeTime+travelTime;
    }
}
