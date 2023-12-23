package fr.efrei.tp.services;

import fr.efrei.tp.domain.entity.Item;
import fr.efrei.tp.domain.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }
    public List<Item> getItems() {
        return itemRepository.findAll();
    }

    public Item getItemById(String id) {
        return itemRepository.findById(id).orElse(null);
    }

    public Item updateItem(Item item) {
        Item itemToUpdate = itemRepository.findById(item.getId()).orElse(new Item());
        itemToUpdate.setName(item.getName());
        itemToUpdate.setPrice(item.getPrice());
        return itemRepository.save(itemToUpdate);
    }

    public void deleteItem(String id) {
        itemRepository.deleteById(id);
    }
}
