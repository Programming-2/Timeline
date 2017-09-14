package com.javanerds.scenes;

import com.javanerds.main.Assets;
import com.javanerds.main.Timeline;

import java.awt.*;

public class SixthGen extends Scene{

    public SixthGen() {

    }

    @Override
    public void tick() {
        if(Timeline.getKey().space) {
            Scene.setScene(Timeline.getSeventhGen());
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("7", 0, 20);
        g.drawImage(Assets.gamecube, 650, 100, null);
        g.drawImage(Assets.xbox, 700, 420, null);
        g.drawImage(Assets.ps2, 100, 200, null);
        g.setFont(new Font("Comic Sans MS", 1, 60));
        g.drawString("Sixth Generation", 400, 50);
        g.setFont(new Font("Comic Sans MS", 1, 30));
        g.drawString("Gamecube, 2001", 720, 340);
        g.drawString("Xbox, 2001", 770, 600);
        g.drawString("Playstation 2, 2000", 130, 550);
    }
}
