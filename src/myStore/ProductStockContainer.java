/**
 * SYSC 2004 Winter 2021 - Milestone 5 ProductStockContainer Class
 *
 * @authors Gilles Myny & Tawseef Patel
 * @version 5.0
 */

package myStore;

public interface ProductStockContainer {
    int getProductQuantity(Product p1);

    void addProductQuantity(Product p1, int quantity);

    void removeProductQuantity(Product p1, int quantity);

    int getNumOfProducts();
}
