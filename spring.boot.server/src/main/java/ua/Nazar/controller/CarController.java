package ua.Nazar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.Nazar.domain.CarDTO;
import ua.Nazar.service.CarService;

@RestController
@RequestMapping("cars")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@PostMapping
	public ResponseEntity<Void> create(@RequestBody CarDTO dto){
		carService.create(dto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	public ResponseEntity<List<CarDTO>> getAll(){
		return new ResponseEntity<List<CarDTO>>(carService.findAll(), HttpStatus.OK);
	}
	
}
