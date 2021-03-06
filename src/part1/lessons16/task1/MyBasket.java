package part1.lessons16.task1;

import java.util.*;

public class MyBasket implements Basket {


    HashMap<String,Integer> products = new HashMap<>();


    @Override
    public void addProduct(String product, int quantity) {
        products.put(product,quantity);

    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (products.containsKey(product)){
            products.replace(product,quantity);
        }

    }

    @Override
    public void clear() {
        products.clear();


    }

    @Override
    public void getProducts() {
        Set<String> keys= products.keySet();
        ArrayList<Integer>values= new ArrayList<>(products.values());
        if (products.isEmpty()){
            System.out.println("Корзина пуста");
        }else
        System.out.println("Продукт: "+keys+"Количество: "+values);
        //System.out.printf("Продукт : %s \n Значение : %d",keys,values);
    }

    @Override
    public void getProductQuantity(String product) {
        if (products.containsKey(product)){

            System.out.println("Продукт: "+this.products +"\n Количество  ");
        }else {
            products.isEmpty();
            System.out.println("Корзина пуста");
            return;
        }
    }
}
