package com.javanerds.scenes;

import java.awt.*;

public class SeventhGen extends Scene{

    public SeventhGen() {

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("8", 0, 20);

    }
}
