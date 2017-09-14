package com.javanerds.scenes;

import com.javanerds.main.Assets;

import java.awt.*;

public class FourthGen extends Scene{

    public FourthGen(){

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.genesis, 180, 100, null);
        g.drawImage(Assets.supernes, 700, 400, null);
        g.setFont(new Font("Comic Sans MS", 1, 60));
        g.drawString("Fourth Generation", 400, 50);
        g.setFont(new Font("Comic Sans MS", 1, 30));
        g.drawString("Sega Genesis, 1989", 180, 280);
        g.drawString("Super NES, 1991", 720, 600);
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("5", 0, 20);

    }
}
