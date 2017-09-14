package com.javanerds.scenes;

import com.javanerds.main.Timeline;

import java.awt.Font;
import java.awt.Graphics;

public class Title extends Scene {

    public Title() {

    }

    @Override
    public void tick() {
        if(Timeline.getKey().space) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Scene.setScene(Timeline.getFirstGen());
        }
    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("1", 0, 20);
        g.setFont(new Font("Comic Sans MS", 1, 70));
        g.drawString("The History of Gaming Technology", 60, 200);
        g.setFont(new Font("Comic Sans MS", 1, 40));
        g.drawString("By Jarod Davies, Jakob Misbach, and Will Anderson", 120, 550);
    }

}
