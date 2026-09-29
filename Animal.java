package edu.txst.game;

/**
 * Contract for any animal that can make a sound.
 * <p>
 * This is an {@code interface}: it declares WHAT an animal must do but not HOW.
 * {@link Cat} and {@link Pig} {@code implements} it and each supply their own
 * behavior, so code can treat them uniformly through an {@code Animal} reference
 * (polymorphism).
 */
// Package-private (no "public") - only classes in edu.txst.game can see it.
interface Animal {
	/**
	 * Prints this animal's characteristic sound to standard output.
	 * Every implementing class must provide its own version.
	 */
	// Interface methods are implicitly public and abstract; no body allowed here.
	void makeSound();
}
