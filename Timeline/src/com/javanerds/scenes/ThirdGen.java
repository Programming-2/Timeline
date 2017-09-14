package com.javanerds.scenes;

import java.awt.*;

public class ThirdGen extends Scene{

    public ThirdGen(){

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("4", 0, 20);

    }
}
