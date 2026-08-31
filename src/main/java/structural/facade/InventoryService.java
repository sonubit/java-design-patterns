package structural.facade;

public class InventoryService {

    public void reserve(String productId) {

        System.out.println(
                "Inventory reserved: " + productId
        );
    }
}
