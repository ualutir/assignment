package com.assignment.domain;

public class Fish extends Animal{
	private String _color;
	 
    public String getColor() {
        return this._color;
    }
	
	private String _size;
	 
    public String getSize() {
        return this._size;
    }
    
    public Fish(String color, String size) {
    	this._color = color;
    	this._size = size;
    }  
}
