package com.javanerds.scenes;

import java.awt.*;

public class FourthGen extends Scene{

    public FourthGen(){

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("5", 0, 20);

    }
}
