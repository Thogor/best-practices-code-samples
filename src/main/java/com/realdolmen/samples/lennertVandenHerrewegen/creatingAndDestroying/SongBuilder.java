package com.realdolmen.samples.lennertVandenHerrewegen.creatingAndDestroying;

import java.util.ArrayList;
import java.util.List;

public class SongBuilder {
    private final String name;
    private final String artist;
    private final String duration;

    // Optional parameters
    private final List<String> featured;
    private final boolean isOnSpotify;


    public static class Builder {
        private final String name;
        private final String artist;
        private final String duration;

        // Optional parameters - initialized to default values
        private List<String> featured = new ArrayList<>();
        private boolean isOnSpotify = false;

        public Builder(String name, String artist, String duration) {
            this.name = name;
            this.artist = artist;
            this.duration = duration;
        }

        public Builder featuring(List<String> artists) {
            featured = artists;
            return this;
        }

        public Builder isOnSpotify(Boolean _isOnSpotify) {
            isOnSpotify = _isOnSpotify;
            return this;
        }

        //BUILD function to return object of class
        public SongBuilder build() {
            return new SongBuilder(this);
        }
    }

    public SongBuilder(Builder b) {
        this.name = b.name;
        this.artist = b.artist;
        this.duration = b.duration;
        this.featured = b.featured;
        this.isOnSpotify = b.isOnSpotify;
    }
}

class mainBuilder {
    public static void main(String[] args) {
        SongBuilder song1 = new SongBuilder.Builder("King Bromeliad", "Floating Points", "8:52").build();
        List<String> artists = new ArrayList<>();
        artists.add("Katy B");
        SongBuilder song2 = new SongBuilder.Builder("Calm Down", "Floating Points", "4:03").isOnSpotify(true).featuring(artists).build();
    }
}
