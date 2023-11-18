/* Given a list of countries and their capitals represented as pairs such as
[("USA", "Washington D.C."), ("France", "Paris"), ("Japan", "Tokyo"), ("Italy", "Rom
e"), ("India", "New Delhi")]
where each pair represents a country and its capital, find the capital of a given
country. If the country is not present in the list, print "Capital not found."*/ 
import java.util.HashMap;
import java.util.Scanner;
public class Country {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the country name : ");
        String country=scanner.next();
        String[][] countryName={
            {"USA", "Washington D.C."},
            {"France", "Paris"},
            {"Japan", "Tokyo"},
            {"Italy", "Rome"},
            {"India", "New Delhi"}
        };
        findCapitals(countryName,country);
    }
    // public static void findCapitals(String[][] countryName,String country){
    //     for(int i=0;i<countryName.length;i++){
    //         for(int j=0;j<countryName[i].length;j++){
    //             // System.out.println(countryName[i][j]);
    //             if(countryName[i][j].equals(country)){
    //                 System.out.println(countryName[i][j+1]);
    //                 return;
    //             }
                
    //         }
    //     }
    //     System.out.println("Country not found");
    //     }

    // public static void findCapitals(String[][] countryName,String country){
    //     for(String[] pair:countryName){
    //         if(pair[0].equals(country)){
    //             System.out.println(pair[1]);
    //             return;
    //         }
    //     }
    //     System.out.println("not found");
    // }

    public static void findCapitals(String[][] countryName,String country){
        HashMap<String,String> mapping=new HashMap<>();
            for(String[] pair:countryName){
                mapping.put(pair[0],pair[1]);
                
            }
            String capital=mapping.get(country);
        //    if(capital==null){
        //     System.out.println("not found");
        //    }else{
        //     System.out.println(capital);
        //    }
        System.out.println((capital==null)?"not found":capital);
        }
}
