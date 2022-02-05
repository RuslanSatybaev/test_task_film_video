package testgroup.filmography.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "films")
public class Film {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int position;

    @Column
    private Double rating;

    @Column(name = "title")
    private String nameEn;

    @Column
    private int year;

    @Column(name = "countVotePeople")
    private int ratingVoteCount;

    @Column(name = "choose_date_for_rating")
    private Date dateOFSelection;

    public Film() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRatingVoteCount() {
        return ratingVoteCount;
    }

    public void setRatingVoteCount(int countVotePeople) {
        this.ratingVoteCount = countVotePeople;
    }

    public Date getDateOFSelection() {
        return dateOFSelection;
    }

    public void setDateOFSelection(Date dateOFSelection) {
        this.dateOFSelection = dateOFSelection;
    }

    public Film(int id, int position, Double rating, String nameEn, int year, int ratingVoteCount) {
        this.id = id;
        this.position = position;
        this.rating = rating;
        this.nameEn = nameEn;
        this.year = year;
        this.ratingVoteCount = ratingVoteCount;
    }
}
