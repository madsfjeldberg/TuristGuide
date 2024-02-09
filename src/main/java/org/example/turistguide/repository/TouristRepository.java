package org.example.turistguide.repository;

import org.example.turistguide.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {

    List<TouristAttraction> attractions = new ArrayList<>();

    public TouristRepository() {
        attractions.add(new TouristAttraction("Eiffel Tower", "A wrought-iron lattice tower on the Champ de Mars in Paris, France."));
        attractions.add(new TouristAttraction("Statue of Liberty", "A colossal neoclassical sculpture on Liberty Island in New York Harbor in New York City."));
        attractions.add(new TouristAttraction("Great Wall of China", "A series of fortifications made of stone, brick, tamped earth, wood, and other materials."));
        attractions.add(new TouristAttraction("Machu Picchu", "An Incan citadel set high in the Andes Mountains in Peru."));
        attractions.add(new TouristAttraction("Taj Mahal", "An ivory-white marble mausoleum on the right bank of the Yamuna river in the Indian city of Agra."));
    }

    public TouristAttraction getAttraction(String name) {
        return attractions.stream().filter(t -> t.getName().equals(name)).findFirst().orElse(null);
    }

    public List<TouristAttraction> getAttractions() {
        return attractions;
    }

    public TouristAttraction addAttraction(TouristAttraction attraction) {
        attractions.add(attraction);
        return attraction;
    }

    public TouristAttraction updateAttraction(TouristAttraction attraction) {
        for (TouristAttraction t : attractions) {
            if (t.getName().equals(attraction.getName())) {
                t.setDescription(attraction.getDescription());
                return t;
            }
        }
        return null;
    }

    public TouristAttraction deleteAttraction(String attraction) {
        for (TouristAttraction t : attractions) {
            if (t.getName().equals(attraction)) {
                attractions.remove(t);
                return t;
            }
        }
        return null;
    }
}
