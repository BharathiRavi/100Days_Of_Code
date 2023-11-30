public class Ticket {
   private static int count=1;
   private final int id;
   private final char pickUpPoint;
   private final char dropingPoint; 
   private final Taxi taxi;
   private final Customer customer;
   private final int pickUpTime;
   private final int amount;
   public Ticket(int amount,int pickUpTime,Customer customer,Taxi taxi,char dropingPoint,char pickUpPoint){
    this.id=count;
    count++;
    this.pickUpPoint=pickUpPoint;
    this.dropingPoint=dropingPoint;
    this.customer=customer;
    this.taxi=taxi;
    this.pickUpTime=pickUpTime;
    this.amount=amount;

   }
   public int getId(){
        return this.id;
   }
   public char getPickUpPoint(){
        return this.pickUpPoint;
   }
   public char getDropingPoint(){
        return this.dropingPoint;
   }
   public Taxi getTaxi(){
        return this.taxi;
   }
   public Customer getCustomer(){
        return this.customer;
   }
   public int getPickUpTime(){
        return this.pickUpTime;
   }
   public int getAmount(){
        return this.amount;
   }
}
