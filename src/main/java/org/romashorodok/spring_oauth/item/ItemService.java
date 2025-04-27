package org.romashorodok.spring_oauth.item;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ItemService {

    private final ItemMongoRepository repository;

    private List<Item> items;

    @PostConstruct
    void init() {
        repository.deleteAll();
        items.add(new Item( "name1", "description"));
        items.add(new Item("2", "name2", "description2"));
        items.add(new Item("3", "name3", "description3"));
        repository.saveAll(items);
    }

    public List<Item> getAll() {
        return repository.findAll();
    }


    public Item getById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

    public Item create(Item item) {

        return repository.save(item);
    }

    public Item update(Item item) {
        return repository.save(item);
    }
}