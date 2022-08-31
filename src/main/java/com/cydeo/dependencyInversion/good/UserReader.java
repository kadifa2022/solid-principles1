package com.cydeo.dependencyInversion.good;

public class UserReader {
    private Reader reader;//depends on reader interface

    public UserReader(Reader reader){
        this.reader =reader;
    }

    public String getUsername() {
        return reader.getUsername();
    }
}
