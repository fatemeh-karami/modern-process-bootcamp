package com.modern.process.abstractClasses.fileReader;

import java.nio.file.Path;

public class uppercaseFileReader extends BaseFileReader{

    public uppercaseFileReader(Path filePath){
        super(filePath);
    }
    @Override
    protected String mapFileLine(String line) {
        return line.toUpperCase();
    }
}
