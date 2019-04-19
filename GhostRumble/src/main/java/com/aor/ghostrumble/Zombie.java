package com.aor.ghostrumble;

public class Zombie extends Enemy {

    public Zombie(int x, int y) {
        super(x, y, 10);
    }

    @Override
    protected Movement createMovStrategy() {
        return new LinearMovement();
    }
}
