package dev.java.Fridge.service;
import dev.java.Fridge.model.Food;
import dev.java.Fridge.repository.FoodRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }
    //Listar
    public List<Food> getAll(){
        return foodRepository.findAll();
    }
    //Criar
    public Food save(Food food){
        return foodRepository.save(food);
    }
    //Deletar
    public void delete(Long id){
        foodRepository.deleteById(id);
    }
}
