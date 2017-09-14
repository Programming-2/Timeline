package com.javanerds.scenes;

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
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("7", 0, 20);

    }
}
