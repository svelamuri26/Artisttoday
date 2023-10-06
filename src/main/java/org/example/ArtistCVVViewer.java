package org.example;

import java.util.ArrayList;
import java.util.List;

 class ArtistCSVViewer {

    public static void main(String[] args) {
        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist("Ed", "Sheeran"));
        artists.add(new Artist("Taylor", "Swift"));
        artists.add(new Artist("Lady", "Gaga"));

        displayArtistsAsCSV(artists);
    }

    public static void displayArtistsAsCSV(List<Artist> artists) {
        System.out.println("CSV Format:");
        System.out.println("First Name,Last Name");

        for (Artist artist : artists) {
            System.out.println(artist.toCSVString());
        }
    }
}


