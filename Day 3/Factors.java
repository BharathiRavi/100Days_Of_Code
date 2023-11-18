public class Factors implements Comparable<Factors>{
    String fruit;
    int weight;
    public  Factors(String fruit,int weight){
        this.fruit=fruit;
        this.weight=weight;
    }
    public String toString(){
        return fruit+" "+weight;
    }
    public int compareTo(Factors newWeight){
        return Integer.compare(this.weight,newWeight.weight);
    }
}
