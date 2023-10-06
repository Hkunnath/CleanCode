package org.example;

public class ArtistImplementation implements Artist {

    private String Artistname;

    @Override

    public void setName(String name) {
        Artistname = name;
    }

    @Override
    public String getName() {
        return Artistname;
    }
}
