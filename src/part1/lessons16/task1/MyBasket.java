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
        //arrayList.clear();
        //System.out.println("Корзина пуста:"+arrayList);

    }

    @Override
    public void getProducts() {
        Set<String> keys= products.keySet();
        Set<Integer> values = (Set<Integer>) products.values();
        System.out.printf("Продукт : %s \n Значение : %d",keys,values);
        return;



    }

    @Override
    public void getProductQuantity(String product) {
        if (products.containsKey(product)){
            System.out.println("Продукт: "+product +"количество  "+products.values());
        }else {
            products.isEmpty();
            System.out.println("Корзина пуста");
            return;
        }
    }
}
