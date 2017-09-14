package com.javanerds.scenes;

import java.awt.*;

public class GabeNewell extends Scene{

    public GabeNewell() {

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
