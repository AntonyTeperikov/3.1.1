package com.example.demo1.reository;

import com.example.demo1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository <User,Long> {
    @Transactional
    User getById(int id);
    @Transactional
    void deleteById(int id);
}
