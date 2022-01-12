package testgroup.filmograhy.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import testgroup.filmograhy.controller.ApiMain;
import testgroup.filmograhy.controller.FilmTop;

public class Add {

    public static void main(String[] args) {
        addDB();
    }

    private static SessionFactory sessionFactory;

    public static void addDB() {
        sessionFactory = new Configuration().configure().buildSessionFactory();

        Add add = new Add();

        System.out.println("Adding developer's records to the DB");
        /**
         *  Adding developer's records to the database (DB)
         */

        for (int i = 0; i < 10; i++) {
            add.addDeveloper(ApiMain.getFilmRating(i), ApiMain.getFilmName(i), ApiMain.getFilmYear(i), ApiMain.getFilmCountVote(i));
        }
    }

    public void addDeveloper(Double rating, String nameEn, int year, int ratingVoteCount) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        FilmTop filmTop = new FilmTop(rating, nameEn, year, ratingVoteCount);
        session.save(filmTop);
        transaction.commit();
        session.close();
    }
}
