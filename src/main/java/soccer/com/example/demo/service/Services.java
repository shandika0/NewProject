package soccer.com.example.demo.service;

import soccer.com.example.dto.Goals;
import soccer.com.example.demo.entity.Entities;
import soccer.com.example.demo.interfaces.Interface;
import soccer.com.example.dto.Assists;
import soccer.com.example.dto.PlayerDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soccer.com.example.demo.repository.PlayerRepo;
import java.util.ArrayList;
import java.util.List;

@Service
public class Services implements Interface {

    @Autowired
    PlayerRepo repo;

    @Override
    public Entities create(PlayerDTO player) throws Exception {
        ModelMapper mapper = new ModelMapper();
        Entities ent = mapper.map(player, Entities.class);
        try {
            ent.setName(player.getName());
            ent.setNationality(player.getNationality());
            ent.setAge(player.getAge());
            ent.setGoals(player.getGoals());
            ent.setAssists(player.getAssists());
            repo.save(ent);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }
        return ent;
    }

    @Override
    public List<Entities> findAll() {
        List<Entities> list = new ArrayList<>();
        repo.findAll().stream().forEach(player -> {
            list.add(player);
        });
        return list;
    }

    @Override
    public List<Entities> getPlayersByName(String name) {
        List<Entities> list = repo.getPlayersByName(name.toLowerCase());
        return list;
    }

	@Override
	public List<Entities> getByAge(Integer age) {
        List<Entities> list = repo.getByAge(age);
		return list;
	}
	

	@Override
	public List<Entities> getByNationality(String nationality) {
        List<Entities> list = repo.getByNationality(nationality.toLowerCase());
		return list;
	}


	@Override
	public List<Entities> getByGoals(Goals goals) {
        List<Entities> list = repo.getByGoals(goals.getFrom(), goals.getTo());
		return list;
	}


	@Override
	public List<Entities> getByAssists(Assists assists) {
		List<Entities> list = repo.getByAssists(assists.getFrom(), assists.getTo());
		return list;
	}


}
