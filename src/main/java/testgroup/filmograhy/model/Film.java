package testgroup.filmograhy.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "films")
public @Data class Film {

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
}
