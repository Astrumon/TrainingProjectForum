package com.skidchenko.DAOLayer.SpringDataRepository;

import com.skidchenko.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<User,Long> {

    List<User> findAllByFirstName (String firstName) ;
    List<User> findAllByLastName (String lastName) ;
    User findAllById (Long id) ;
}
