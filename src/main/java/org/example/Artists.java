package org.example;

public interface Artists extends searchable{

    void add(Artist artist);

    Artist get(int index);

    int size();
}
