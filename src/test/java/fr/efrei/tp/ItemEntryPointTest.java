package fr.efrei.tp;

import fr.efrei.tp.domain.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ItemEntryPointTest extends AbstractTest{
    @Autowired
    private ItemEntryPoint itemEntryPoint;

    @Test
    void getItems() {
        assertNotNull(itemEntryPoint.getItems());
    }

    @Test
    void getItemById() {
        assertNotNull(itemEntryPoint.getItemById("1"));
    }

    @Test
    void createItem() {
        var item = new Item();
        item.setId("33");
        item.setName("test");
        item.setPrice(300);
        assertNotNull(itemEntryPoint.createItem(item));
    }

    @Test
    void updateItem() {
        var item = new Item("1", "test", 300);
        assertNotNull(itemEntryPoint.updateItem(item));
    }

    @Test
    void deleteItem() {
        assertDoesNotThrow(() -> itemEntryPoint.deleteItem("1"));
    }
}
