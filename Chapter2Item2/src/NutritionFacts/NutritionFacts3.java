package NutritionFacts;

public class NutritionFacts3 {
    private final int servingSize;  // (mL)             required
    private final int servings;     // (per container)  required
    private final int calories;     // (per serving)    optional
    private final int fat;          // (g/serving)      optional
    private final int sodium;       // (mg/serving)     optional
    private final int carbohydrate; // (g/serving)      optional

    private NutritionFacts3(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }


    public static class Builder {
        //Required parameters
        private final int servingSize;
        private final int servings;

        //Optional parameters - initialized with default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts3 build() {
            return new NutritionFacts3(this);
        }

        private void test() {
            NutritionFacts3 cocaCola = new Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
        }
    }
}
