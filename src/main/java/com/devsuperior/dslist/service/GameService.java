package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entitys.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Service devolve DTO
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    //importar do spring
    @Transactional(readOnly = true)
    public List<GameMinDto> findAll(){
        var resultado = gameRepository.findAll();
        List<GameMinDto> dto = resultado.stream().map(x-> new GameMinDto(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }



}
