package com.javanerds.scenes;

import java.awt.*;

public class MichaelAbrash extends Scene{

    public MichaelAbrash() {

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("9", 0, 20);

    }
}
