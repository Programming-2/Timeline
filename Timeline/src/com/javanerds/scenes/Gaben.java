package com.javanerds.scenes;

import java.awt.*;

public class Gaben extends Scene{

    public Gaben() {

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("10", 0, 20);

    }
}
