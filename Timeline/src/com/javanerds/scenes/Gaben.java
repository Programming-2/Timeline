package com.javanerds.scenes;

import com.javanerds.main.Assets;

import java.awt.*;

public class Gaben extends Scene{

    public Gaben() {

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.gaben, 100, 75, null);
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("10", 0, 20);
        g.setFont(new Font("Comic Sans MS", 1, 40));
        g.drawString("Gabe Newell", 200, 50);
        g.setFont(new Font("Comic Sans MS", 1, 30));
        g.drawString("born November 3, 1962 in Seattle, WA", 550, 150);
        g.drawString("president and co-founder of Valve", 550, 200);
        g.drawString("inspired by Michael Abrash to start company", 550, 250);
        g.drawString("originally worked for Microsoft after", 550, 300);
        g.drawString("dropping out of Harvard", 600, 350);
        g.drawString("reason Half-life, Portal, Left 4 Dead,", 550, 400);
        g.drawString("and Team Fortress 2 exist", 600, 450);
        g.drawString("Valve was the company that created...", 550, 500);

    }
}
