package com.assignment.domain;

public class Fish extends SwimmerImpl{
	private String _color;
	 
    public String getColor() {
        return this._color;
    }
	
	private String _size;
	 
    public String getSize() {
        return this._size;
    }
    
    public Fish() {
    	
    } 
    
    public Fish(String color, String size) {
    	this._color = color;
    	this._size = size;
    }  
}
