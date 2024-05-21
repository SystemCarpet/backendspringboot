package co.edu.sena.systemcarpet.controller;

import co.edu.sena.systemcarpet.entities.Barrio;
import co.edu.sena.systemcarpet.service.BarrioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/autocarpet/barrio", method = {RequestMethod.PUT,RequestMethod.POST,RequestMethod.GET, RequestMethod.DELETE})
@CrossOrigin(origins = "*")
public class BarrioController {

    private Map<String, Object> response = new HashMap<>();
    @Autowired
    private BarrioService barrioService;
    @GetMapping("/all")
    public ResponseEntity<Map<String, Object>> getAll() {
        List<Barrio> barriosList = barrioService.fAll();
        barriosList.forEach(System.out::println);
        this.response.put("status", "ok");
        this.response.put("data", barriosList);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
