package com.predios.Repository;

import com.predios.Model.Predio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PredioRepository extends JpaRepository<Predio, String> {
}
