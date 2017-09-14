package com.javanerds.scenes;

import com.javanerds.main.Timeline;

import java.awt.*;

public class FifthGen extends Scene{

    public FifthGen() {

    }

    @Override
    public void tick() {
        if(Timeline.getKey().space) {
            Scene.setScene(Timeline.getSixthGen());
        }
    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("6", 0, 20);

    }
}
