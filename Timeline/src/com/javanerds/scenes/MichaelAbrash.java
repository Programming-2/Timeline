package com.javanerds.scenes;

import com.javanerds.main.Assets;
import com.javanerds.main.Timeline;

import java.awt.*;

public class MichaelAbrash extends Scene{

    public MichaelAbrash() {

    }

    @Override
    public void tick() {
        if(Timeline.getKey().space) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Scene.setScene(Timeline.getGaben());
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.michaelabrash, 250, 175, null);
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("9", 0, 20);
        g.setFont(new Font("Comic Sans MS", 1, 40));
        g.drawString("Michael Abrash (2001-present)", 200, 150);
        g.setFont(new Font("Comic Sans MS", 1, 30));
        g.drawString("important 21st century computer scientist", 450, 250);
        g.drawString("helped develop Microsoft Xbox in 2001", 450, 300);
        g.drawString("currently Chief Scientist for Oculus VR", 450, 350);
        g.drawString("inspiration to many after him, such as...", 450, 400);

    }
}
