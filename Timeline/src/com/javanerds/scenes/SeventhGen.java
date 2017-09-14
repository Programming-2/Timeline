package com.javanerds.scenes;

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

    }
}
