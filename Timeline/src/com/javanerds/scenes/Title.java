package com.javanerds.scenes;

import java.awt.*;

public class Title extends Scene {

    public Title() {

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawString("By Jarod Davies, Jakob Misbach, and Will Anderson", 0, 100);
    }

}
