package org.example.springBoot.repos;

import org.example.springBoot.domain.Message;
import org.example.springBoot.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MessageRepo extends CrudRepository<Message, Long> {

    Page<Message> findAll(Pageable pageable);

    Page<Message> findByTag(String tag, Pageable pageable);

    @Query("from Message as m where m.author = :author")
    Page<Message> findByUser(Pageable pageable, @Param("author") User author);
}
