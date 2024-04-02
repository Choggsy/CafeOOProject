package org.example.menu.drinks.drink;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

class RecipeTest {
    @Test
    void shotMustNotBeNull() {
        assertThatNullPointerException()
                .isThrownBy(() -> Recipe.of(null, Base.MILK, ContainerType.GLASS))
                .withMessage("shot must not be null");
    }

    @Test
    void baseMustNotBeNull() {
        assertThatNullPointerException()
                .isThrownBy(() -> Recipe.of(1, null, ContainerType.GLASS))
                .withMessage("base must not be null");
    }

    @Test
    void containerTypeMustNotBeNull() {
        assertThatNullPointerException()
                .isThrownBy(() -> Recipe.of(0, Base.WATER, null))
                .withMessage("containerType must not be null");
    }

    @Test
    void shotNumberMustBeBiggerThanZero() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> Recipe.of(-1, Base.WATER, ContainerType.GLASS))
                .withMessage("Invalid Shot Amount");
    }
}