package com.itsystem.kino.repository;

import com.itsystem.kino.model.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScreeningRepository extends JpaRepository<Screening, Integer> {

    List<Screening> findScreeningByScreeningID(Integer screeningID);
}
