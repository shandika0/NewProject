package soccer.com.example.demo.controller;

import soccer.com.example.dto.Goals;
import soccer.com.example.demo.entity.Entities;
import soccer.com.example.demo.service.Services;
import soccer.com.example.dto.Assists;
import soccer.com.example.dto.PlayerDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("players")
public class Controller {

    @Autowired
    Services service;

    @PostMapping("")
    public ResponseEntity<Entities> create(@RequestBody PlayerDTO player) throws Exception {
        return ResponseEntity.ok().body(service.create(player));
    }

    @GetMapping("")
    public ResponseEntity<List<Entities>> getAll(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/name")
    public ResponseEntity<List<Entities>> getPlayersByName(@RequestParam String name){
        return ResponseEntity.ok().body(service.getPlayersByName(name));
    }

    @GetMapping("/nationality")
    public ResponseEntity<List<Entities>> getByNationality(@RequestParam String nationality){
        return ResponseEntity.ok().body(service.getByNationality(nationality));
    }

    @GetMapping("/age")
    public ResponseEntity<List<Entities>> getByAge(@RequestParam Integer age){
        return ResponseEntity.ok().body(service.getByAge(age));
    }
    
    @PostMapping("/goals")
    public ResponseEntity<List<Entities>> getByGoals(@RequestBody Goals goals){
        return ResponseEntity.ok().body(service.getByGoals(goals));
    }

    @PostMapping("/assists")
    public ResponseEntity<List<Entities>> getByAssists(@RequestBody Assists assists){
        return ResponseEntity.ok().body(service.getByAssists(assists));
    }

}

