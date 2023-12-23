package fr.efrei.tp;

import fr.efrei.tp.domain.entity.Item;
import fr.efrei.tp.services.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemEntryPoint {
    private final ItemService itemService;

    @GetMapping
    public List<Item> getItems() {
        return itemService.getItems();
    }

    @GetMapping("/{id}")
    public Item getItemById(String id) {
        return itemService.getItemById(id);
    }

    @PostMapping
    public Item createItem(Item item) {
        return itemService.createItem(item);
    }

    @PatchMapping
    public Item updateItem(Item item) {
        return itemService.updateItem(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(String id) {
        itemService.deleteItem(id);
    }
}
