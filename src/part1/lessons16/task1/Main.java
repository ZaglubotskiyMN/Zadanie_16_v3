package part1.lessons16.task1;

public class Main {

    public static void main(String[] args) {
	MyBasket basketHashMap = new MyBasket();
	System.out.println("Add product");
		basketHashMap.addProduct("Milk",10);
		basketHashMap.addProduct("Water",5);
		basketHashMap.addProduct("Beer", 16);
		basketHashMap.getProducts();
	System.out.println("Remove product");
		basketHashMap.removeProduct("Beer");
		basketHashMap.getProducts();
	System.out.println("Update product quantity");
		basketHashMap.updateProductQuantity("Milk",11);
		basketHashMap.getProducts();
		///basketHashMap.clear();
		basketHashMap.getProductQuantity("Water");
		basketHashMap.getProducts();
    }
}
