package demo;

public class lala {
    private static int count=1;
    private int id;
    private String name;
    public lala(String name){
        this.id=count;
        count=count+1;
        this.name=name;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName ){
        this.name=newName;
    }

}
