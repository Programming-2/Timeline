package com.javanerds.scenes;

import com.javanerds.main.Assets;

import java.awt.*;

public class SecondGen extends Scene{

    public SecondGen(){

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.atari2600, 490, 100, null);
        g.drawImage(Assets.atari2600games, 700, 400, null);
        g.setFont(new Font("Comic Sans MS", 1, 40));
        g.drawString("Second Generation", 400, 50);
        g.drawString("Atari 2600, 1977", 700, 100);
    }
}
