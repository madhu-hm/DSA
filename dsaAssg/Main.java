package dsaAssg;

public class Main {
	public static void main(String[] args) {
        ArrayList<String> iceCreamFlavors = new ArrayList<>();
        
        // Add some delicious flavors
        iceCreamFlavors.add("BlackCurrant");
        iceCreamFlavors.add("Chocolate");
        iceCreamFlavors.add("Strawberry");
        iceCreamFlavors.add("Butterscotch");
        iceCreamFlavors.add("Italian Delight");
        
        System.out.println("Our ice cream flavors:");
        System.out.println(iceCreamFlavors); 
        
        // Check if we have a specific flavor
        String favorite = "Butterscotch";
        if (iceCreamFlavors.contains(favorite)) {
            System.out.println("Yes! We have " + favorite + "!");
        } else {
            System.out.println("Sorry, no " + favorite + " today.");
        }
        
        // Getting flavors from index
        System.out.println(iceCreamFlavors.get(1));
        
        // Remove the least popular flavor
        String removed = iceCreamFlavors.remove(2);
        System.out.println("Removed flavor: " + removed);
        
        // Add a new seasonal flavor
        iceCreamFlavors.add("Pista");
        System.out.println("Updated flavors:");
        System.out.println(iceCreamFlavors);
        
        // Get current number of flavors
        System.out.println("Total flavors available: " + iceCreamFlavors.size());
    }
}
