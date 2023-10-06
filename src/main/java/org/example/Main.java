package org.example;

public class Main {
    public static void main(String[] args) {
        Artist art1 = new ArtistImplementation();
        Artist art2 = new ArtistImplementation();
        art1.setName("TaylorSwift");
        art2.setName("Selena");

        Artists arts1 = new ArtistsImplementation();
        arts1.add(art1);
        arts1.add(art2);

        StringBuilder sb = new StringBuilder();
        for(int i =0; i < arts1.size();i++){
            sb.append(arts1.get(i).getName());
            sb.append(";");
        }
        System.out.println(sb);

    }
}