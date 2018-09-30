package com.irexchange.controller;

import java.util.ArrayList;
import java.util.List;

import com.irexchange.model.Child;

public class Game {
	/** Original child list */
	private List<Child> childList;

	/** Result of the child list after play the game */
	private List<Child> resultList;

	/** Winning child */
	private Child winner;

	/**
	 * k'th child is out
	 */
	private int k;

	/**
	 * Constructor.
	 *
	 * @param n number of kids
	 * @param k k'th child is out
	 */
	public Game(int n, int k) {
		childList = new ArrayList<Child>();
		resultList = new ArrayList<Child>();
		// init all child and build then clockwise
		for (int i = 1; i < n + 1; i++) {
			childList.add(new Child(i));
		}
		this.setK(k);
		winner = null;
	}

	public void playGame() {
		int i = 1;
		// Loop the child list again and again untill the game is finished.
		while (true) {
			for (Child r : childList) {
				// Make sure the child is not out.
				if (r.isOut() == false) {
					// Only 1 child left. He/She is the winner.
					if (resultList.size() == childList.size() - 1) {
						winner = r;
						return;
					}
					// Find the k'th child. He/she is out.
					if (i == k) {
						resultList.add(r);
						r.setOut(true);
						i = 1;
					} else { // Otherwise keep going.
						i++;
					}
				}
			}
		}
	}

	/**
	 * @return the k
	 */
	public int getK() {
		return k;
	}

	/**
	 * @param k the k to set
	 */
	public void setK(int k) {
		this.k = k;
	}

	/**
	 * @return the childList
	 */
	public List<Child> getChildList() {
		return childList;
	}

	/**
	 * @param childList the childList to set
	 */
	public void setChildList(List<Child> childList) {
		this.childList = childList;
	}

	/**
	 * @return the resultList
	 */
	public List<Child> getResultList() {
		return resultList;
	}

	/**
	 * @param resultList the resultList to set
	 */
	public void setResultList(List<Child> resultList) {
		this.resultList = resultList;
	}

	/**
	 * @return the winner
	 */
	public Child getWinner() {
		return winner;
	}

	/**
	 * @param winner the winner to set
	 */
	public void setWinner(Child winner) {
		this.winner = winner;
	}
}
