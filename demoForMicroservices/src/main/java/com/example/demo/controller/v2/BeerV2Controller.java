package com.example.demo.controller.v2;

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

import com.example.demo.entity.v2.BeerV2;
import com.example.demo.service.serviceImpl.v2.BeerServiceV2;

@RestController
@RequestMapping("/app/v2")
public class BeerV2Controller {
	@Autowired
	private BeerServiceV2 beerS;

	@GetMapping("/{id}")
	public ResponseEntity<BeerV2> getBeer(@PathVariable("id") int id) {
		return new ResponseEntity<>(beerS.getBeerById(id), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<BeerV2> setBeer(@RequestBody BeerV2 beer) {
		return new ResponseEntity<>(beerS.setBeer(beer), HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<BeerV2> updateBeer(@PathVariable("id") int id, @RequestBody BeerV2 beer) {
		return new ResponseEntity<>(beerS.updateBeer(id, beer), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteBeer(@PathVariable("id") int id, @RequestBody BeerV2 beer) {
		beerS.deleteBeer(id, beer);
	}
}
