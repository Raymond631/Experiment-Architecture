package com.example.task9;


public class ImageProcessorConcrete extends ImageProcessor{
    public ImageProcessorConcrete(ImageFormat imageFormat, ImageFilter imageFilter) {
        super(imageFormat, imageFilter);
    }

    @Override
    public void processImage(String fileName) {
        imageFormat.decode(fileName);
        imageFilter.applyFilter(fileName);
    }
}
