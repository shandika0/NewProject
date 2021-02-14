package soccer.com.example.interfaces;

import soccer.com.example.dto.PlayerDTO;
import soccer.com.example.dto.Goals;
import soccer.com.example.dto.Assists;
import soccer.com.example.entity.Entities;
import java.util.List;

public interface Interface {
    List<Entities> findAll();

    Entities create(PlayerDTO user) throws Exception;

    List<Entities> getPlayersByName(String name);

    List<Entities> getByNationality(String nationality);

    List<Entities> getByAge(Integer age);

    List<Entities> getByGoals(Goals goals);

    List<Entities> getByAssists(Assists assists);
    
}
