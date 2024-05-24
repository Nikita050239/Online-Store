package view;

import common.AppView;
import data.models.Product;
import data.service.ShopService;

import java.util.ArrayList;

public class CatalocView extends AppView {
    public CatalocView(ArrayList<AppView> children, ShopService shopService) {
        super("Каталог", children);
        this.shopService = shopService;
    }
final ShopService shopService;
    @Override
    public void action() {
        ArrayList<Product> catalog = shopService.getCatalog();
        for (Product product: catalog) {
            System.out.println(product.id + " " + product.title + " " + product.price);
        }
        System.out.println();
    }
}
