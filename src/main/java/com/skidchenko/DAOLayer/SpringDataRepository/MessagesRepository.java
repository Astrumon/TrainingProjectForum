package com.skidchenko.DAOLayer.SpringDataRepository;

import com.skidchenko.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessagesRepository extends JpaRepository <Message, Long> {
    List<Message> findAllByUserId(Long userId);
    List<Message> findAllBySendToId(Long sendToId);

    }
