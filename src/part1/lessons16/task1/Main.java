package part1.lessons16.task1;

public class Main {

    public static void main(String[] args) {
	MyBasket basketArrayList = new MyBasket();
	System.out.println("Add product");
	basketArrayList.addProduct("Milk",10);
	basketArrayList.addProduct("Water",5);
	basketArrayList.addProduct("Beer", 16);
	basketArrayList.getProducts();
	System.out.println("Remove product");
	basketArrayList.removeProduct("Beer");
	basketArrayList.getProducts();
	System.out.println("Update product quantity");
	basketArrayList.updateProductQuantity("Milk",11);
	basketArrayList.getProducts();
	basketArrayList.clear();
	basketArrayList.getProductQuantity("Water");
	basketArrayList.getProducts();
    }
}
