package com.skidchenko.DAOLayer.SpringDataRepository;

import com.skidchenko.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotesRepository extends JpaRepository <Note, Long> {
    List<Note> findAllByUserId(Long userId);
}
