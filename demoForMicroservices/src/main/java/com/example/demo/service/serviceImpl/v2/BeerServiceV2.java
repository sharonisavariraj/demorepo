package com.example.demo.service.serviceImpl.v2;

import org.springframework.stereotype.Service;

import com.example.demo.entity.v2.BeerEnum;
import com.example.demo.entity.v2.BeerV2;
import com.example.demo.service.v2.BeersV2;

@Service
public class BeerServiceV2 implements BeersV2 {

	@Override
	public BeerV2 getBeerById(int id) {
		BeerV2 beer = new BeerV2(1, BeerEnum.ALE);
		return beer;
	}

	@Override
	public BeerV2 setBeer(BeerV2 b) {
		BeerV2 beer = new BeerV2(b.getId(), b.getName());
		return beer;
	}

	@Override
	public BeerV2 updateBeer(int id, BeerV2 beer2) {
		BeerV2 beer = new BeerV2(beer2.getId(), beer2.getName());
		return beer;
	}

	@Override
	public void deleteBeer(int id, BeerV2 beer) {
		System.out.println("deleted");

	}

}
