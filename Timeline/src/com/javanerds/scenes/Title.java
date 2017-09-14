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
        g.setFont(new Font("Comic Sans MS", 1, 70));
        g.drawString("The History of Game Development", 60, 200);
        g.setFont(new Font("Comic Sans MS", 1, 40));
        g.drawString("By Jarod Davies, Jakob Misbach, and Will Anderson", 120, 550);
    }

}
