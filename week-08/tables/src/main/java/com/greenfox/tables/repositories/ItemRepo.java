package com.greenfox.tables.repositories;

import com.greenfox.tables.entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepo extends CrudRepository<Item, Long> {
}
