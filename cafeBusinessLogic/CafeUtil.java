import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for (int i = 0; i < numWeeks +1; i++){
            sum = sum + i;

        }
        return sum;
    } 


    

public String getOrderTotal(double[] orderArr){
    double total = 0;
    for (int i=0; i < orderArr.length; i++){
        total += orderArr[i];
    }
    return String.format("Order Total: $%.2f \r\n ", total);
}



public void displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
for (int i=0; i< menuItems.size(); i++){
    System.out.println(i+ " " + menuItems.get(i)+ "--" + "$" + prices.get(i));
}
}



public ArrayList<String> addCustomer(ArrayList <String> customers){
   
        System.out.println("Please enter name:");
        String userName = System.console().readLine();
        customers.add(userName);
        System.out.println("Hello " + userName + ",\r\n" + "There are " + (customers.size() - 1)+ " people ahead of you.");
return customers;
        }
       
    }
   



