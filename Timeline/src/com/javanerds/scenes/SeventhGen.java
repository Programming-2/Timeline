package com.javanerds.scenes;

import com.javanerds.main.Assets;
import com.javanerds.main.Timeline;

import java.awt.*;

public class SeventhGen extends Scene{

    public SeventhGen() {

    }

    @Override
    public void tick() {
        if(Timeline.getKey().space) {
            Scene.setScene(Timeline.getMichaelAbrash());
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
        g.drawString("8", 0, 20);
        g.drawImage(Assets.ps3, 650, 100, null);
        g.drawImage(Assets.xbox360, 700, 420, null);
        g.drawImage(Assets.wii, 100, 200, null);
        g.setFont(new Font("Comic Sans MS", 1, 60));
        g.drawString("Seventh Generation", 400, 50);
        g.setFont(new Font("Comic Sans MS", 1, 30));
        g.drawString("Playstation 3, 2006", 720, 340);
        g.drawString("Xbox 360, 2005", 770, 600);
        g.drawString("Wii, 2006", 130, 550);
    }
}
