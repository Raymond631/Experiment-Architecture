package com.example.task9;

import lombok.AllArgsConstructor;


// 桥接抽象类
@AllArgsConstructor
public abstract class ImageProcessor {
    protected ImageFormat imageFormat;
    protected ImageFilter imageFilter;
    public abstract void processImage(String fileName);
}
