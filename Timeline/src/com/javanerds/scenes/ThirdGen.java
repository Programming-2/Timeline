package com.javanerds.scenes;

import com.javanerds.main.Assets;

import java.awt.*;

public class ThirdGen extends Scene{

    public ThirdGen(){

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.atari7800, 180, 100, null);
        g.drawImage(Assets.nes, 700, 400, null);
        g.setFont(new Font("Comic Sans MS", 1, 60));
        g.drawString("Third Generation", 400, 50);
        g.setFont(new Font("Comic Sans MS", 1, 30));
        g.drawString("Atari 7800, 1986", 200, 280);
        g.drawString("NES, 1985", 770, 600);
    }
}
