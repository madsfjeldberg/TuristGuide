package org.example.turistguide.service;

import org.example.turistguide.model.TouristAttraction;
import org.example.turistguide.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {

    TouristRepository repo = new TouristRepository();

    public TouristAttraction getAttraction(String name) {
        return repo.getAttraction(name);
    }

    public List<TouristAttraction> getTouristAttractions() {
    return repo.getAttractions();
    }

    public TouristAttraction addTouristAttraction(TouristAttraction attraction) {
        return repo.addAttraction(attraction);
    }

    public TouristAttraction updateTouristAttraction(TouristAttraction attraction) {
        return repo.updateAttraction(attraction);
    }

    public TouristAttraction deleteTouristAttraction(String attraction) {
        return repo.deleteAttraction(attraction);
    }
}
