package com.irexchange.test.controller;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.irexchange.controller.Game;
import com.irexchange.model.Child;

/**
 * Unit test for com.irexchange.controller.Game
 * 
 * @author Lu Wang
 */
public class GameTest {

	/**
	 * Test with only one child
	 */
	@Test
	public void test1() {
		Game game = new Game(1, 10);
		game.playGame();

		assertEquals("Winner Child id", 1, game.getWinner().getId());
		assertEquals("Number of out child", 0, game.getResultList().size());
	}

	/**
	 * Test with only 2 children
	 */
	@Test
	public void test2() {
		Game game = new Game(2, 10);
		game.playGame();

		assertEquals("Winner Child id", 1, game.getWinner().getId());
		assertEquals("Number of out child", 1, game.getResultList().size());
		assertEquals("Out child id", 2, game.getResultList().get(0).getId());
	}

	/**
	 * Test with 5 children
	 */
	@Test
	public void test3() {
		Game game = new Game(5, 2);
		game.playGame();

		assertEquals("Winner Child id", 3, game.getWinner().getId());

		List<Child> list = game.getResultList();

		assertEquals("Number of out child", 4, game.getResultList().size());
		assertEquals("1st out child id", 2, list.get(0).getId());
		assertEquals("2nd out child id", 4, list.get(1).getId());
		assertEquals("3rd out child id", 1, list.get(2).getId());
		assertEquals("4th out child id", 5, list.get(3).getId());
	}
}
