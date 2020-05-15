package com.SnakeGame_Rest.Controller;


import com.SnakeGame_Rest.Repo.GameRepository;
import com.SnakeGame_Rest.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;

@CrossOrigin(origins="*")
@RestController
public class GameController {
    @Autowired
    private GameRepository gameRepository;

//    @RequestMapping("/users")
//    public List<User> getAllUsers(){
//        return gameRepository.findAll();
//    }


    @RequestMapping("/game/{id}")
    public Game findGame(@PathVariable int id){
        return gameRepository.findById(id);
    }
    @RequestMapping(value="/game",method= RequestMethod.POST)
    public Game createGame(@RequestBody Game game){
        return gameRepository.save(game);
    }


}
