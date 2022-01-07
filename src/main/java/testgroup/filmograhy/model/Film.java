package testgroup.filmograhy.model;

import lombok.Data;

import java.util.Date;


public @Data class Film {
    private int id;
    private String title;
    private int year;
    private String genre;
    private boolean watched;
    private int position;
    private int rating;
    private int countVotePeople;
    private Date choice;

    @Override
    public String toString() {
        return id + " " + title + " " + year + " " + genre + " " + watched;
    }
}
