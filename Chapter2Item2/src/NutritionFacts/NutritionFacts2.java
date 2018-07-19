package NutritionFacts;

//JavaBeans pattern - allows inconsistency, mandates mutability
public class NutritionFacts2 {
    private int servingSize  = -1;  // (mL)             required (no default value)
    private int servings     = -1;  // (per container)  required (no default value)
    private int calories     = 0;   // (per serving)    optional
    private int fat          = 0;   // (g/serving)      optional
    private int sodium       = 0;   // (mg/serving)     optional
    private int carbohydrate = 0;   // (g/serving)      optional

    public NutritionFacts2(){ }

    //Setters
    public void setServingSize(int val)  { servingSize = val; }
    public void setServings(int val)     { servings = val; }
    public void setCalories(int val)     { calories = val; }
    public void setFat(int val)          { fat = val; }
    public void setSodium(int val)       { sodium = val; }
    public void setCarbohydrate(int val) { carbohydrate = val; }


    private void test(){
        NutritionFacts2 cocaCola = new NutritionFacts2();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setSodium(27);
    }
}
