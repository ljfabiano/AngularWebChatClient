package com.tiy;

/**
 * Created by jfabiano on 9/28/2016.
 */
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by jfabiano on 9/15/2016.
 */
public interface MessageRepository extends CrudRepository<Message, Integer> {
    // allow to search by user

    @Query("SELECT g FROM Message g WHERE g.userName LIKE ?1%")//we are not selecting from the table, but from the entity(Message and not Messages(table))(also name is the java name rather than the sql deal)
    List<Message> findByUserNameStartsWith(String userName);
}
