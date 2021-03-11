package part1.lessons16.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyBasket implements Basket {

    ArrayList arrayList = new ArrayList();


    @Override
    public void addProduct(String product, int quantity) {
        arrayList.add(product);
        arrayList.add(quantity);
    }

    @Override
    public void removeProduct(String product) {
        int index =arrayList.indexOf(product);
        arrayList.remove(index+1);
        arrayList.remove(product);

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (arrayList.contains(product)){
            int index = arrayList.indexOf(product);
            arrayList.set(index+1,quantity);
        }
    }

    @Override
    public void clear() {
        arrayList.clear();
        System.out.println("Корзина пуста:"+arrayList);

    }

    @Override
    public List<String> getProducts() {
        Iterator product = arrayList.iterator();
        while (product.hasNext()) {
            System.out.printf("%s %s \n", product.next(), product.next() + "шт. ");
        }
            System.out.println();
            return arrayList;

    }

    @Override
    public int getProductQuantity(String product) {
        if (arrayList.contains(product)){
            int index = arrayList.indexOf(product);
            System.out.println("Количество продуктов: "+product+ "="+arrayList.get(index));
            return (Integer) arrayList.get(index+1);
        }else {
            System.out.println("Корзина пуста");
            return 0;
        }
    }
}
