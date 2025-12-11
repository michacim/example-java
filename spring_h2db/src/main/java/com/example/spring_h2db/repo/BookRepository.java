package com.example.spring_h2db.repo;

import com.example.spring_h2db.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
