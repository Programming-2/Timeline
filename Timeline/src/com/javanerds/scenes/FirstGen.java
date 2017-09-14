package com.javanerds.scenes;

import com.javanerds.main.Assets;
import com.javanerds.main.Timeline;

import java.awt.*;

public class FirstGen extends Scene{

    public FirstGen(){

    }

    @Override
    public void tick() {
        if(Timeline.getKey().space) {
            Scene.setScene(Timeline.getSecondGen());
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
        g.drawString("2", 0, 20);
        g.drawImage(Assets.odyessy, 100, 175, null);
        g.setFont(new Font("Comic Sans MS", 1, 40));
        g.drawString("First Generation of Consoles", 200, 50);
        g.setFont(new Font("Comic Sans MS", 1, 30));
        g.drawString("The Atari Odyessy", 500, 200);
        g.drawString("1974", 500, 250);
        g.drawString("console with classic Pong game", 500, 300);
        g.drawString("used knobs to control sticks on screen", 500, 350);

    }
}
