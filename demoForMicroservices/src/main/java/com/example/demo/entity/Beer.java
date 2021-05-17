package com.example.demo.entity;

public class Beer {

	private int id;
	private String name;

	public Beer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Beer(int id, String name) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Beer [id=" + id + ", name=" + name + "]";
	}

}
