package com.javanerds.main;

import java.awt.image.BufferedImage;

public class Assets {
    public static BufferedImage atari2600, atari2600games, atari7800, gaben, gamecube, genesis, michaelabrash, n64, nes, odyessy, playstation, ps2, ps3, ps4, saturn, steamlogo, supernes, wii, wiiu, xbox, xbox1, xbox360;

    public static void init(){
        atari2600 = ImageLoader.loadImage("/img/2600.jpg");
        atari2600games = ImageLoader.loadImage("/img/2600games.jpg");
        atari7800 = ImageLoader.loadImage("/img/7800.jpg");
        gaben = ImageLoader.loadImage("/img/gaben.jpg");
        gamecube = ImageLoader.loadImage("/img/gamecube.jpg");
        genesis = ImageLoader.loadImage("/img/genesis.jpg");
        michaelabrash = ImageLoader.loadImage("/img/michaelabrash.jpg");
        n64 = ImageLoader.loadImage("/img/n64.png");
        nes = ImageLoader.loadImage("/img/nes.jpg");
        odyessy = ImageLoader.loadImage("/img/odyessy.jpg");
        playstation = ImageLoader.loadImage("/img/playstation.jpg");
        ps2 = ImageLoader.loadImage("/img/ps2.jpg");
        ps3 = ImageLoader.loadImage("/img/ps3.jpg");
        ps4 = ImageLoader.loadImage("/img/ps4.jpg");
        saturn = ImageLoader.loadImage("/img/saturn.jpg");
        steamlogo = ImageLoader.loadImage("/img/steamlogo.png");
        supernes = ImageLoader.loadImage("/img/supernes.png");
        wii = ImageLoader.loadImage("/img/wii.jpg");
        wiiu = ImageLoader.loadImage("/img/wiiu.png");
        xbox = ImageLoader.loadImage("/img/xbox.jpg");
        xbox1 = ImageLoader.loadImage("/img/xbox1.png");
        xbox360 = ImageLoader.loadImage("/img/xbox360.jpg");
    }
}
