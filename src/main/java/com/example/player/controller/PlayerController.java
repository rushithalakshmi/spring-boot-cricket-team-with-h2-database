/*
 * 
 * You can use the following import statemets
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */
 package com.example.player.controller;
import com.example.player.service.PlayerH2Service;
import com.example.player.model.Player;
import java.util.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
@RestController
public class PlayerController{
    @Autowired 
    public PlayerH2Service playerService;
    @GetMapping("/players")
    public ArrayList<Player> getPlayers(){
        return playerService.getPlayers();
    }
    @PostMapping("/players")

    public Player addPlayer(@RequestBody Player player){
        return playerService.addPlayer(player);
    }
    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable ("playerId") int playerId){
        return playerService.getPlayerById(playerId);
    }

    
    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable ("playerId") int playerId,@RequestBody Player player){
        return playerService.updatePlayer(playerId, player);
    }
    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable ("playerId") int playerId){
        playerService.deletePlayer(playerId);
    }

}
