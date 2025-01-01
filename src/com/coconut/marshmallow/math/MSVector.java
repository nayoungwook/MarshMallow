package com.coconut.marshmallow.math;

public class MSVector {

	private float x, y, z;

	public MSVector(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public MSVector(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public MSVector cloneVector() {
		MSVector result = new MSVector(0, 0);
		result.setTransform(x, y, z);
		return result;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public float getZ() {
		return z;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public void setTransform(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public void setTransform(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void translate(float xv, float yv) {
		this.x += xv;
		this.y += yv;
	}

	public void translate(float xv, float yv, float zv) {
		this.x += xv;
		this.y += yv;
		this.z += zv;
	}

}