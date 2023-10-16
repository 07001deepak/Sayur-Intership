public class Restaurant {
    //private properties
       private String customerName;

    //public properties
    public String foodItems;
    public int foodPrice;
    public double  gstPrice;
    public int  discount;
    public int savings;

    Constructor(customerName){      // initialize the constructor to show the below details automatically when an object  created
         this.customerName = customerName;             
        System.out.println(foodItems);
        System.out.println(foodPrice);
          System.out.println(gstPrice);
          System.out.println(discount);
            System.out.println(savings);
    }
    public void addItems(){
        // add the food items which is asked by the user
    }
    public void calPrice(){
        // calculate the price of the food items which is ordered by the Customer and apply the discount and gst
    }
   public void showPrice(){
    // Display the amount of the food items ordered by the customer 
   }

}
