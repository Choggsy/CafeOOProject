package org.example.menu.drinks.drink;

import static java.util.Objects.requireNonNull;

public enum DrinkType {
    LATTE(Recipe.of(1,Base.MILK,ContainerType.GLASS)),
    AMERICANO(Recipe.of(2,Base.WATER,ContainerType.MUG)),
    CAPPUCCINO(Recipe.of(2,Base.MILK,ContainerType.CUP));

    private final Recipe recipe;

    DrinkType(Recipe recipe) {
        this.recipe = requireNonNull(recipe,"recipe can not be null");
    }
}
