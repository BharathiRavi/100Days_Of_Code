public class DateClass implements Comparable<DateClass>{
    int day;
    int month;
    int year;
    public DateClass(String date){
        String[] d=date.split("/");
        day=Integer.parseInt(d[0]);
        month=Integer.parseInt(d[1]);
        year=Integer.parseInt(d[2]);
    }
    public String toString(){
        return day+":"+month+":"+year;
    }
    public int compareTo(DateClass other){
        if(this.year!=other.year){
            return Integer.compare(this.year,other.year); 
        }
        if(this.year==other.year && this.month!=other.month){
            return Integer.compare(this.month, other.month);
        }
        if(this.year==other.year && this.month==other.month){
            return Integer.compare(this.day, other.day);
        }
        return 0;
    }
    
}
