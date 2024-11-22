package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entitys.Game;
import org.springframework.data.jpa.repository.JpaRepository;

//Retorna entidade
public interface GaneRepository extends JpaRepository<Game,Long> {
}
