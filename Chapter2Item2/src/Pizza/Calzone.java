package Pizza;

import static Pizza.Pizza.Topping.HAM;

public class Calzone extends Pizza {
    private boolean sauceInside;

    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false; //Default

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private void test() {
        Calzone calzone = new Builder().addTopping(HAM).sauceInside().build();
    }
}
