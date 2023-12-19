package com.example.task4;

public class JpgReaderFactory extends ImageReaderFactory{
    @Override
    public ImageReader createImageReader() {
        return new JpgReader();
    }
}
