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
        assertNotNull(itemEntryPoint.createItem(new Item()));
    }

    @Test
    void updateItem() {
        var item = new Item("12", "test", 300);
        assertNotNull(itemEntryPoint.updateItem(new Item()));
    }

    @Test
    void deleteItem() {
        assertDoesNotThrow(() -> itemEntryPoint.deleteItem("1"));
    }
}
