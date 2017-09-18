package com.javanerds.scenes;

import com.javanerds.main.Assets;
import com.javanerds.main.Timeline;

import java.awt.*;

public class FifthGen extends Scene{

    public FifthGen() {

    }

    @Override
    public void tick() {
        if(Timeline.getKey().space) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Scene.setScene(Timeline.getSixthGen());
        }
    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("6", 0, 20);
        g.drawImage(Assets.saturn, 180, 100, null);
        g.drawImage(Assets.playstation, 810, 450, null);
        g.drawImage(Assets.n64, 100, 450, null);
        g.setFont(new Font("Comic Sans MS", 1, 40));
        g.drawString("Fifth Generation (1995-1999)", 400, 50);
        g.setFont(new Font("Comic Sans MS", 1, 30));
        g.drawString("Sega Saturn, 1995", 140, 310);
        g.drawString("Sony Playstation, 1995", 770, 600);
        g.drawString("Nintendo 64, 1996", 115, 640);
    }
}
