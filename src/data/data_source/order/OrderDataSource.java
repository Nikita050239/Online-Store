package data.data_source.order;

import data.models.CartItem;
import data.models.Order;
import data.models.Product;

import java.util.ArrayList;

public abstract class OrderDataSource {
    private Order order;
   public abstract void createOrder(Order order);
    public abstract Order getOrder();

}
