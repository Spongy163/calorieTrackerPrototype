/* Brighton Drill
 * Title: Daily Nutriition Class
 * Date: 2/16/2026
 * Description: An object that stores the date, calories, and protein of a day. 
 */

package calorieTrackerPrototype;

import java.time.LocalDate;

public class NutritionSnapshot {
	
	/* INSTANCE DATA FIELDS
	 * -calories:int = stores the calorie intake
	 * -protein:int = stores protein intake in grams
	 * -date:LocalDate = stores the date
	 */
	
	private int calories;
	private int protein;
	private LocalDate date;
	
	/* CONSTRUCTORS
	 * +DailyNutrition() = no argument constructor
	 */
	
	NutritionSnapshot() {
		this.calories = 0;
		this.protein = 0;
		this.date = LocalDate.now();
	}

	
	//GETTER AND SETTER
	
	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * @return the protein
	 */
	public int getProtein() {
		return protein;
	}
	
	/* METHODS
	 * +addCalories(calories:int):void = increment the calories (negative to decrement)
	 * +addProtein(protein:int):void = increment the protein (negative to decrement)
	 * +resetCalories():void = resets calories to zero
	 * +resetProtein():void = resets the protein to zero
	 */
	
	
	/**
	 * @param calories the calories to increment by
	 */
	public void addCalories(int calories) {
		this.calories = this.calories + calories;
	}
	
	/**
	 * @param protein the protein to increment by
	 */
	public void addProtein(int protein) {
		this.protein = this.protein + protein;
	}
	
	public void resetCalories() {
		this.calories = 0;
	}
	
	public void resetProtein() {
		this.protein = 0;
	}
	
}
