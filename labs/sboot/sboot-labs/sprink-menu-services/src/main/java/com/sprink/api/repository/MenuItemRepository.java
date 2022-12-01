package com.sprink.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprink.api.model.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem,Integer>{

	MenuItem save(Optional<MenuItem> item);

}
