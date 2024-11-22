package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entitys.Game;
import com.devsuperior.dslist.repositories.GaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Service devolve DTO
@Service
public class GameService {

    @Autowired
    private GaneRepository gameRepository;

    public List<GameMinDto> findAll(){
        var resultado = gameRepository.findAll();
        List<GameMinDto> dto = resultado.stream().map(x-> new GameMinDto(x)).toList();
        return dto;
    }



}
