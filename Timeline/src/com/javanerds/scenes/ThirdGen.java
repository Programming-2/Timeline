package com.javanerds.scenes;

import com.javanerds.main.Assets;
import com.javanerds.main.Timeline;

import java.awt.*;

public class ThirdGen extends Scene{

    public ThirdGen(){

    }

    @Override
    public void tick() {
        if(Timeline.getKey().space) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Scene.setScene(Timeline.getFourthGen());
        }
    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("4", 0, 20);
        g.drawImage(Assets.atari7800, 180, 100, null);
        g.drawImage(Assets.nes, 700, 400, null);
        g.setFont(new Font("Comic Sans MS", 1, 40));
        g.drawString("Third Generation (1985-1988)", 400, 50);
        g.setFont(new Font("Comic Sans MS", 1, 30));
        g.drawString("Atari 7800, 1986", 200, 280);
        g.drawString("NES, 1985", 770, 600);
        g.drawString("NES was first console w/ D-Pad", 150, 450);
        g.drawString("& Nintendo's first successful console", 150, 500);
    }
}
