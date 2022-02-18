package ru.netology.domain;

public class ProductRepository {
    private Product[] items = new Product[0];

    public ProductRepository() {
    }


    public ProductRepository(Product[] items) {
        this.items = items;
    }

    public Product[] getItems() {
        return items;
    }

    public void setItems(Product[] items) {
        this.items = items;
    }

    public Product[] save(Product item) {

        int length = items.length + 1;
        Product tmp[] = new Product[length];

        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }

        int lastElement = tmp.length - 1;
        tmp[lastElement] = item;
        items = tmp;
        return items;
    }

    public Product findById(int id) {
        for (Product item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void removeById(int id) {
        int length = items.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }

            items = tmp;
        }

    }
}

