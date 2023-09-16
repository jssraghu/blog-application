package com.raghuprojects.blog.repositories;

import com.raghuprojects.blog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
