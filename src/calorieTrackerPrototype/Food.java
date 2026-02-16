/* Brighton Drill
 * Title: Food class
 * Date: 2/16/2026
 * Description: An object that stores food data
 */

package calorieTrackerPrototype;

public class Food {
	
	/* STATIC DATA FIELDS
	 * -foodCount:int
	 */
	
	private static int foodCount = 0;
	
	/* INSTANCE DATA FIELDS
	 * -name:String
	 * -calories:int
	 * -protein:int
	 * 
	 */
	
	private String name;
	private int calories;
	private int protein;
	
	/* CONSTRUCTOR
	 * +Food(name:String, calories:int, protein:int) = no argument constructor
	 */
	
	public Food(String name, int calories, int protein) {
		this.name = name;
		this.calories = calories;
		this.protein = protein;
		foodCount ++;
	}

	// GETTER and SETTER
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public static int getFoodCount() {
		return foodCount;
	}
	
	
	
	
}
