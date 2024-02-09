package ie.atu;

public class OnlineOrderingSystem {
    public static void main(String[] args){
        //Create an array or list of MenuItem objects
        MenuItem[] menuItems = new MenuItem[]{
            new Burger("Cheese Burger", 7.99, "Beef burger, lettuce, pickles, onions, cheese"),
            new Pizza("Jalepeno", 12.99, "jalepeno, cheese, curry"),
            new Salad("salad", 2.99, "Lettuce, tomaote, strawberries, tuna"),
            new BaileyCoffee("Baileys Coffee", 3.99, "Baileys, Coffee, Milk"),
        };

        //Display details of each menu item
        for(MenuItem menuItem : menuItems){
            System.out.println("Name: "+menuItem.getName());
            System.out.println("Price: "+menuItem.getPrice());
            System.out.println("Description: "+menuItem.getDescription()+"\n");
        }

        //Calculate and diplay the total cost of the order
        double totalCost = 0;
        for (MenuItem menuItem : menuItems){
            totalCost += menuItem.getPrice();
        }

        System.out.println("Total Cost: $"+totalCost+"\n");

    }
}
