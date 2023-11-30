package demo;

public class Main {
    public static void main(String[] args) {
        lala obj=new lala("loop");
        lala obj1=new lala("loop");
        System.out.println(obj.getId()+" "+obj.getName());
        System.out.println(obj1.getId()+" "+obj1.getName());
        obj1.setName("bubu");
        System.out.println(obj1.getName());
        System.out.println(obj.getId()+" "+obj.getName());
        System.out.println(obj1.getId()+" "+obj1.getName());
    }
}
