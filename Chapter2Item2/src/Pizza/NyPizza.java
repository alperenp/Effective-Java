package Pizza;

import java.util.Objects;

import static Pizza.NyPizza.Size.SMALL;
import static Pizza.Pizza.Topping.ONION;
import static Pizza.Pizza.Topping.SAUSAGE;

public class NyPizza extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE}
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder (Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    private void test() {
        NyPizza nypizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
    }
}
