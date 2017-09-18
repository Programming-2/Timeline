package com.javanerds.scenes;

import com.javanerds.main.Assets;
import com.javanerds.main.Timeline;

import java.awt.*;

public class EighthGen extends Scene{

    public EighthGen() {

    }

    @Override
    public void tick() {
        if(Timeline.getKey().space) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Scene.setScene(Timeline.getMichaelAbrash());
        }
    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("8", 0, 20);
        g.drawImage(Assets.ps4, 650, 100, null);
        g.drawImage(Assets.xbox1, 700, 400, null);
        g.drawImage(Assets.wiiu, 100, 200, null);
        g.setFont(new Font("Comic Sans MS", 1, 40));
        g.drawString("Eighth Generation (2013-present)", 400, 50);
        g.setFont(new Font("Comic Sans MS", 1, 30));
        g.drawString("Playstation 4, 2013", 650, 300);
        g.drawString("Xbox One, 2013", 720, 550);
        g.drawString("Wii U, 2012", 170, 400);
    }
}
