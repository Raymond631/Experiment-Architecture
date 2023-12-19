package com.example.task4;

public class GifReaderFactory extends ImageReaderFactory{
    @Override
    public ImageReader createImageReader() {
        return new GifReader();
    }
}
