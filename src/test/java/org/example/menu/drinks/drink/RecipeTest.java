package org.example.menu.drinks.drink;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNullPointerException;

class RecipeTest {
    @Test
    void shotMustNotBeNull() {
        assertThatNullPointerException()
                .isThrownBy(() -> Recipe.of(null, Base.MILK, ContainerType.GLASS))
                .withMessage("shot must not be null");
    }
}