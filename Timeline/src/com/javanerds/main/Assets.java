package com.javanerds.main;

import java.awt.image.BufferedImage;

public class Assets {
    public static BufferedImage odyessy;

    public static void init(){
        odyessy = ImageLoader.loadImage("/img/odyessy.jpg");
    }
}
