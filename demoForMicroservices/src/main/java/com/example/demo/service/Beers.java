package com.example.demo.service;

import com.example.demo.entity.Beer;

public interface Beers {
	public Beer getBeerById(int id);

	Beer setBeer(Beer b);

	Beer updateBeer(int id, Beer beer);

	void deleteBeer(int id, Beer beer);
}
