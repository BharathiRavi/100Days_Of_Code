import java.util.HashMap;  
import java.util.Scanner;

public class Booking {
    private static Scanner input=new Scanner(System.in);
    private static HashMap<Integer,Taxi> taxiMap=new HashMap<>();
    private static HashMap<Integer,Customer> customerMap =new HashMap<>();
    private static HashMap<Integer,Ticket> ticketMap =new HashMap<>();
    public static void main(String[] args) {
        createTaxi(4);
        // displayDetails();
        System.out.println("\n<--------Welcome to Taxi Booking-------->\n");
        while(true){
            System.out.println("Menu");
            System.out.println("1.Book Ticket");
            System.out.println("2.Ticket status");
            System.out.println("3.Taxi detail");
            System.out.println("4.Quit");
            System.out.println("\nEnter the choice : \n");
            int choice=input.nextInt();
            switch(choice){
                case 1:
                    bookTicket();
                    break;
                case 2:
                    ticketStatus();
                    break;
                case 3:
                    displayDetails();
                    break;
                case 4:
                    System.out.println("\n<----thank you kelambu--->\n");
                    return;
                default:
                System.out.println("summa enter panatha");
        
            }


        }
        
    }
    public static void bookTicket(){
        System.out.println("va va book pannu");
        Customer c1=createCustomer();
        if(c1==null){
            System.out.println("\n invalid customer id \n");
            return;
        }
        System.out.println("\n where can i pick up you: \n");
        char pickup=input.next().charAt(0);
        System.out.println("\n where can i drop you\n");
        char drop=input.next().charAt(0);
        System.out.println("\nTell me time to pickup\n");
        int pickupTime=input.nextInt();
        Taxi t1=getTaxi(pickup, pickupTime);
        if(t1==null){
            System.out.println("\n no taxi found \n");
            return;
        }
        int amount=0;
        int distance=(drop-pickup)*15;
        distance=distance-5;
        amount=amount+100;
        amount=amount+(distance*10);
        System.out.println("\ntotal amount for this trip: "+amount+"\n");
        System.out.println("\n do you want to contiue booking(y/n): ");
        char c=input.next().charAt(0);
        if(c=='y'||c=='Y'){

            // public Ticket(int amount,int pickUpTime,Customer customer,
            // Taxi taxi,char dropingPoint,char pickUpPoint){
                
            Ticket tec=new Ticket(amount,pickupTime,c1,t1,drop,pickup);
            ticketMap.put(tec.getId(), tec);
            System.out.println("ur id is"+tec.getId());
            t1.updateEarning(amount);
            t1.updateLocation(drop);
            int travelTime=Math.abs(t1.getLocation()-pickup);
            t1.updateFreeTime(travelTime);
        }else{
            System.out.println("can't proceed further");
        }

    }
    // public static Taxi getTaxi(char pickUpPoint,int pickUpTime){
// 1. curr loc taxi available -find low eaernung taxi return taxi
// 2.find ontime taxi -where taxi can reach on time
// 2.1    which is near & which is low earned
            








    //     int min=Integer.MAX_VALUE;
    //     int taxiId=0;
    //     for(Taxi tictic:taxiMap.values()){
    //         if(tictic.getLocation()==pickUpPoint){
    //             if(tictic.getEarning()<min){
    //                 min=tictic.getEarning();
    //                 taxiId=tictic.getId();
    //             }

    //         }
            
    //     }
    //     return taxiMap.get(taxiId);
        
    

    //    }
    public static Taxi getTaxi(char pickUpPoint, int pickUpTime) {
        Taxi nearestTaxiWithLowestEarnings = null;
        int min = Integer.MAX_VALUE;
    
        // Check for taxis at the pickup location with the lowest earnings
        for (Taxi taxi : taxiMap.values()) {
            if (taxi.getLocation() == pickUpPoint && taxi.getEarning() < min) {
                nearestTaxiWithLowestEarnings = taxi;
                min = taxi.getEarning();
            }
        }
    
        // If no taxi is available at the pickup location, find the nearest taxi that can reach on time
        if (nearestTaxiWithLowestEarnings == null) {
            int minTimeToReach = Integer.MAX_VALUE;
    
            for (Taxi taxi : taxiMap.values()) {
                int timeToReach = calculateTimeToReach(taxi.getLocation(), pickUpPoint);
                if (canReachByTime(taxi, pickUpPoint, pickUpTime) && timeToReach < minTimeToReach) {
                    nearestTaxiWithLowestEarnings = taxi;
                    minTimeToReach = timeToReach;
                }
            }
        }
    
        return nearestTaxiWithLowestEarnings;
    }
    
    // Helper method to calculate time to reach from current location to pickup point
    private static int calculateTimeToReach(char currentLocation, char pickUpPoint) {
        return Math.abs(currentLocation - pickUpPoint) ; // Assuming 60 minutes to travel between adjacent points
    }
    // Add this method to the Booking class
    private static boolean canReachByTime(Taxi taxi, char pickUpPoint, int pickUpTime) {
        int travelTime = Math.abs(taxi.getLocation() - pickUpPoint) ; // Assuming 60 minutes to travel between adjacent points
        int currentTime = taxi.getFreeTime(); // Assuming all taxis start at 6 pm

        return currentTime + travelTime <= pickUpTime;
    }
    
    public static Customer createCustomer(){
        Customer c1;

        System.out.println("\n<-------Are yor new here(y/n)-------->\n");
        char ch=input.next().charAt(0);
        if(ch=='y'||ch=='Y'){
            System.out.println("\nCreating user\n");
            System.out.println("enter name");
            String name=input.next();
            c1=new Customer(name);
            customerMap.put(c1.getId(),c1);
            System.out.println("\nnote ur id : "+c1.getId()+"\n");

        }else{
            System.out.println("\nenter ur id : \n");
            int id=input.nextInt();
            c1=customerMap.get(id);
            
        }
        return c1;
    }
    public static void ticketStatus(){
        System.out.println("\n------paru paru status---------\n");
        System.out.println("enter the id: ");
        int tid=input.nextInt();
        Ticket val=ticketMap.get(tid);
        if(val==null){
            System.out.println("\n-----ticket not found-----\n");
        }
        System.out.println("\n------ticket detail-----\n");
        System.out.println("customer name: " +val.getCustomer().getName());
        System.out.println("taxi id: "+val.getTaxi().getId());
        System.out.println("pickup point: "+val.getPickUpPoint());
        System.out.println("drop point: "+val.getDropingPoint());
        System.out.println("ticket price: "+val.getAmount());
        System.out.println("\n----------------------------\n");

    }
    public static void createTaxi(int n){
        for(int i=0;i<n;i++){
            Taxi taxi=new Taxi();
            taxiMap.put(taxi.getId(), taxi);
            
        }

    }
    public static void displayDetails(){
        System.out.println(taxiMap);
    }
    
}
