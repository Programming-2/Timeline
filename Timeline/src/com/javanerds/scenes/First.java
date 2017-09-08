package com.javanerds.scenes;

import java.awt.*;

public class First extends Scene {

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font("Times New Roman", 1,200));
        g.drawString("Jakob Sucks", 100, 400);
    }
}
