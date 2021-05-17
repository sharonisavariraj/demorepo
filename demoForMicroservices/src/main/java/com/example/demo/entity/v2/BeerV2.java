package com.example.demo.entity.v2;

public class BeerV2 {
	private int id;
	private BeerEnum name;

	public BeerV2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeerV2(int id, BeerEnum name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BeerEnum getName() {
		return name;
	}

	public void setName(BeerEnum name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Beer [id=" + id + ", name=" + name + "]";
	}

}
