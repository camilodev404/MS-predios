package com.predios.Repository;

import com.predios.Model.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MunicipioRepository extends JpaRepository<Municipio, String> {

    @Query("SELECT m FROM Municipio m WHERE m.idDepto = :idDepto")
    List<Municipio> findByDepto(@Param("idDepto") String idDepto);

}
