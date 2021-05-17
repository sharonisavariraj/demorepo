package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Beer;
import com.example.demo.service.serviceImpl.BeerService;

@RestController
@RequestMapping("/app")
public class AppController {
	@Autowired
	private BeerService beerS;

	@GetMapping("/{id}")
	public ResponseEntity<Beer> getBeer(@PathVariable("id") int id) {
		return new ResponseEntity<>(beerS.getBeerById(id), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Beer> setBeer(@RequestBody Beer beer) {
		return new ResponseEntity<>(beerS.setBeer(beer), HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Beer> updateBeer(@PathVariable("id") int id, @RequestBody Beer beer) {
		return new ResponseEntity<>(beerS.updateBeer(id, beer), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteBeer(@PathVariable("id") int id, @RequestBody Beer beer) {
		beerS.deleteBeer(id, beer);
	}
}
