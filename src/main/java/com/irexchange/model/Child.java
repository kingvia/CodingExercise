package com.irexchange.model;

public class Child {
	/**
	 * ID
	 */
	private int id;

	/**
	 * If the child is out.
	 */
	private boolean out;

	/**
	 * Constructor.
	 *
	 * @param id The Child's ID
	 */
	public Child(int id) {
		this.id = id;
		this.out = false;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the out
	 */
	public boolean isOut() {
		return out;
	}

	/**
	 * @param out the out to set
	 */
	public void setOut(boolean out) {
		this.out = out;
	}

	/**
	 * Returns a string that represents the current object.
	 * 
	 * @return A string that represents the current object.
	 */
	public String toStirng() {
		return "Child ID[" + this.getId() + "] out[" + this.isOut() + "]";
	}
}
