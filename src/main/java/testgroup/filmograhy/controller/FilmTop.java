package testgroup.filmograhy.controller;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "films")
public @Data class FilmTop {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "rating")
    public Double rating;

    @Column(name = "title")
    public String nameEn;

    @Column(name = "year")
    public int year;

    @Column(name = "countVotePeople")
    public int ratingVoteCount;

    public FilmTop(Double rating, String nameEn, int year, int ratingVoteCount) {
        this.rating = rating;
        this.nameEn = nameEn;
        this.year = year;
        this.ratingVoteCount = ratingVoteCount;
    }

    public FilmTop() {
    }

}

class FilmDescription {
    public List<FilmTop> films;
}

