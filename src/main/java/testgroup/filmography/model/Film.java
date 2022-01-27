package testgroup.filmography.model;

import javax.persistence.*;

@Entity
@Table(name = "films")
public class Film {

    @Id
    @Column
    private int id;

    @Column
    public int position;

    @Column
    public Double rating;

    @Column
    public String title;

    @Column
    public int year;

    @Column
    public int countVotePeople;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCountVotePeople() {
        return countVotePeople;
    }

    public void setCountVotePeople(int countVotePeople) {
        this.countVotePeople = countVotePeople;
    }
}
