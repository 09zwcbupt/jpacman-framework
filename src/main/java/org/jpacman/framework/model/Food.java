package org.jpacman.framework.model;

import org.jpacman.framework.model.IBoardInspector.SpriteType;

/**
 * A food element on the board.
 * @author Arie van Deursen, TU Delft, Feb 16, 2012
 */
public class Food extends Sprite {
	
	/**
	 * The default number of points if food
	 * gets eaten.
	 */
	public static final int DEFAULT_POINTS = 10;
	
	private int points = DEFAULT_POINTS;
	
	/**
	 * @return that food points are non-negative.
	 */
	protected final boolean foodInvariant() {
		return points >= 0;
	}
	
	/**
	 * Constructor meets invariant of sub and superclass.
	 */
	public Food() {
		assert foodInvariant() && spriteInvariant();
	}

	/**
	 * @return The number of points for this piece of food.
	 */
	public int getPoints() {
		return points;
	}
		
	/**
	 * @param points New number of points.
	 */
	public void setPoints(int points) {
		assert points >= 0;
		this.points = points;
		assert foodInvariant();
	}
	
	/**
	 * @return That this sprite is a piece of Food.
	 */
	@Override
	public SpriteType getSpriteType() {
		return SpriteType.FOOD;
	}

}
