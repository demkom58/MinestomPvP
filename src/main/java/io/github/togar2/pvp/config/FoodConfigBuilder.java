package io.github.togar2.pvp.config;

public class FoodConfigBuilder {
	private final boolean legacy;
	private boolean
			naturalExhaustionEnabled, naturalRegenerationEnabled,
			foodEnabled, foodSoundsEnabled, blockBreakExhaustionEnabled,
			moveExhaustionEnabled;
	
	FoodConfigBuilder(boolean legacy) {
		this.legacy = legacy;
	}
	
	public FoodConfigBuilder defaultOptions() {
		naturalExhaustionEnabled = true;
		naturalRegenerationEnabled = true;
		foodEnabled = true;
		foodSoundsEnabled = true;
		blockBreakExhaustionEnabled = true;
		moveExhaustionEnabled = true;
		return this;
	}
	
	public FoodConfigBuilder naturalExhaustion(boolean naturalExhaustionEnabled) {
		this.naturalExhaustionEnabled = naturalExhaustionEnabled;
		return this;
	}
	
	public FoodConfigBuilder naturalRegeneration(boolean naturalRegenerationEnabled) {
		this.naturalRegenerationEnabled = naturalRegenerationEnabled;
		return this;
	}
	
	public FoodConfigBuilder eating(boolean foodEnabled) {
		this.foodEnabled = foodEnabled;
		return this;
	}
	
	public FoodConfigBuilder eatingSounds(boolean foodSoundsEnabled) {
		this.foodSoundsEnabled = foodSoundsEnabled;
		return this;
	}
	
	public FoodConfigBuilder blockBreakExhaustion(boolean blockBreakExhaustionEnabled) {
		this.blockBreakExhaustionEnabled = blockBreakExhaustionEnabled;
		return this;
	}
	
	public FoodConfigBuilder moveExhaustion(boolean moveExhaustionEnabled) {
		this.moveExhaustionEnabled = moveExhaustionEnabled;
		return this;
	}
	
	public FoodConfig build() {
		return new FoodConfig(
				legacy, naturalExhaustionEnabled, naturalRegenerationEnabled,
				foodEnabled, foodSoundsEnabled, blockBreakExhaustionEnabled,
				moveExhaustionEnabled
		);
	}
}
