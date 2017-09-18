package com.javanerds.scenes;

import com.javanerds.main.Assets;
import com.javanerds.main.Timeline;

import java.awt.*;

public class FourthGen extends Scene{

    public FourthGen(){

    }

    @Override
    public void tick() {
        if(Timeline.getKey().space) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Scene.setScene(Timeline.getFifthGen());
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.genesis, 180, 100, null);
        g.drawImage(Assets.supernes, 700, 400, null);
        g.setFont(new Font("Comic Sans MS", 1, 40));
        g.drawString("Fourth Generation (1989-1994)", 400, 50);
        g.setFont(new Font("Comic Sans MS", 1, 30));
        g.drawString("Sega Genesis, 1989", 180, 280);
        g.drawString("Super NES, 1991", 720, 600);
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("5", 0, 20);

    }
}
