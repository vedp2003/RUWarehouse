package warehouse;

/*
 * Use this class to put it all together.
 */ 
public class Everything {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Use this file to test all methods
        Warehouse w = new Warehouse();
            
        int n = StdIn.readInt();

        for (int i = 0; i < n; i++) {   
            String query = StdIn.readString();
            if(query.equals("add")){
                int day = StdIn.readInt(); 
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt(); 
                int demand = StdIn.readInt();
                w.addProduct(id, name, stock, day, demand);   
            }
            else if(query.equals("delete")){
                int id = StdIn.readInt(); 
                w.deleteProduct(id);
            }
            else if(query.equals("restock")){
                int id = StdIn.readInt(); 
                int restockAmount = StdIn.readInt();
                w.restockProduct(id, restockAmount);
            }
            else if(query.equals("purchase")){
                int day = StdIn.readInt(); 
                int id = StdIn.readInt();
                int amount = StdIn.readInt();
                w.purchaseProduct(id, day, amount);
            }
            
        }

        StdOut.println(w);

    }
}
