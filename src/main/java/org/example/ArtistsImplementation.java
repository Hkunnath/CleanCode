package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArtistsImplementation implements Artists{
    // private List<Artist> artists = new ArrayList<>();
    private Artist[] artists = new Artist[4];
    private int count = 0;

    public void add(Artist artist){
        artists[count++] = artist;
    }

    public Artist get(int index){
        return artists[index];
    }

    @Override
    public List<Artist> search(String lastname) {
        List<Artist> resultList = new ArrayList<>();
        for(int i =0 ; i < count ; i++){
            boolean matches = artists[i].getName().equals(lastname);
            if(matches){
                resultList.add(artists[i]);
            }
        }
        return resultList;
    }
}
