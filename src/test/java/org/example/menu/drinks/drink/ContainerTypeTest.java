package org.example.menu.drinks.drink;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

class ContainerTypeTest {
    @ParameterizedTest
    @EnumSource(ContainerType.class)
    public void validForEveryEnumType(final ContainerType type) {
        assertThat(type).isNotNull();
    }
}