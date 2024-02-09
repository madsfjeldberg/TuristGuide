package org.example.turistguide.controller;

import org.example.turistguide.model.TouristAttraction;
import org.example.turistguide.service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("attractions")
public class TouristController {

    private final TouristService touristService = new TouristService();

    @GetMapping
    public ResponseEntity<List<TouristAttraction>> getTouristAttractions() {
        return ResponseEntity.ok(touristService.getTouristAttractions());
    }

    @GetMapping(path = "{name}")
    public ResponseEntity<TouristAttraction> getAttraction(@PathVariable String name) {
        return ResponseEntity.ok(touristService.getAttraction(name));
    }

    @PostMapping(path = "add")
    public ResponseEntity<TouristAttraction> addAttraction(@RequestBody TouristAttraction attraction) {
        return new ResponseEntity<>(touristService.addTouristAttraction(attraction), HttpStatus.OK);
    }

    @PutMapping(path = "update")
    public ResponseEntity<TouristAttraction> updateAttraction(@RequestBody TouristAttraction attraction) {
        return ResponseEntity.ok(touristService.updateTouristAttraction(attraction));
    }

    @GetMapping(path = "delete/{name}")
    public ResponseEntity<TouristAttraction> deleteAttraction(@PathVariable String name) {
        touristService.deleteTouristAttraction(name);
        return ResponseEntity.ok(touristService.deleteTouristAttraction(name));
    }
}
