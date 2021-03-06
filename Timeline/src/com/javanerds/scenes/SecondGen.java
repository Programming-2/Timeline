package com.javanerds.scenes;

import com.javanerds.main.Assets;
import com.javanerds.main.Timeline;

import java.awt.*;

public class SecondGen extends Scene{

    public SecondGen(){

    }

    @Override
    public void tick() {
        if(Timeline.getKey().space) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Scene.setScene(Timeline.getThirdGen());
        }
    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("3", 0, 20);
        g.drawImage(Assets.atari2600, 300, 150, null);
        g.drawImage(Assets.atari2600games, 300, 400, null);
        g.setFont(new Font("Comic Sans MS", 1, 40));
        g.drawString("Second Generation (1977-1984)", 400, 50);
        g.drawString("Atari 2600, 1977", 700, 300);
        g.drawString("featured cartridge games", 700, 350);
        g.drawString("and a joystick controller", 700, 400);
    }
}
