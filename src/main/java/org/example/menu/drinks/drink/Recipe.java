package org.example.menu.drinks.drink;

import static java.util.Objects.requireNonNull;

class Recipe {
    private Recipe(final Integer shot, final Base base, final ContainerType containerType) {
        requireNonNull(shot, "shot must not be null");
        requireNonNull(base, "base must not be null");
        requireNonNull(containerType, "containerType must not be null");
        if (shot < 0) {
            throw new IllegalArgumentException("Invalid Shot Amount");
        }
    }

    public static Recipe of(final Integer shot,
                            final Base base,
                            final ContainerType containerType) {
        return new Recipe(shot, base, containerType);
    }
}
