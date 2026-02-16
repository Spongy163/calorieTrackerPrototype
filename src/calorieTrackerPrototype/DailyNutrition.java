/* Brighton Drill
 * Title: Daily Nutriition Class
 * Date: 2/16/2026
 * Description: An object that stores the date, calories, and protein of a day. 
 */

package calorieTrackerPrototype;

import java.time.LocalDate;

public class DailyNutrition {
	
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
	
	DailyNutrition() {
		this.calories = 0;
		this.protein = 0;
		date.now();
	}
	
	
	
}
