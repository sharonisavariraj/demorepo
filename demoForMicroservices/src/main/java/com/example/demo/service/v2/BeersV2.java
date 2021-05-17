package com.example.demo.service.v2;

import com.example.demo.entity.v2.BeerV2;

public interface BeersV2 {
	public BeerV2 getBeerById(int id);

	BeerV2 setBeer(BeerV2 beer);

	BeerV2 updateBeer(int id, BeerV2 beer);

	void deleteBeer(int id, BeerV2 beer);
}
