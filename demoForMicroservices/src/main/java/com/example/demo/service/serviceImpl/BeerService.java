package com.example.demo.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Beer;
import com.example.demo.service.Beers;

@Service
public class BeerService implements Beers {

	@Override
	public Beer getBeerById(int id) {
		Beer beer = new Beer(1, "KingFisher");
		return beer;
	}

	@Override
	public Beer setBeer(Beer b) {
		Beer beer = new Beer(b.getId(), b.getName());
		return beer;
	}

	@Override
	public Beer updateBeer(int id, Beer b) {
		Beer beer = new Beer(b.getId(), b.getName());
		return beer;
	}

	@Override
	public void deleteBeer(int id, Beer beer) {
		System.out.println("deleted");
	}

}
