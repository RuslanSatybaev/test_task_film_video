//package testgroup.filmography.controller;
//
//import com.google.gson.Gson;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.URL;
//import java.net.URLConnection;
//import java.util.logging.Logger;
//
//public class ApiMain {
//    static String apiurl = "https://kinopoiskapiunofficial.tech/api/v2.2/films/top?type=TOP_250_BEST_FILMS&page=1";
//    static String apiKey = "e986c301-acb5-48f5-9b1f-4f2bdde8e62e";
//    private static final Logger LOG = Logger.getLogger("Log: ");
//    static String output = getUrlContent(apiurl);
//    static Gson g = new Gson();
//    static FilmDescription description = g.fromJson(output, FilmDescription.class);
//    static String filmName = "";
//    static int filmYear = 0;
//    static double filmRating = 0;
//    static int countVote = 0;
//
//    public static void main(String[] args) {
//
//    }
//
//    public static String getFilmName(int position) {
//        FilmTop filmTop = description.films.get(position);
//        filmName = filmTop.nameEn;
//        return filmName;
//    }
//
//    public static int getFilmYear(int position) {
//        FilmTop filmTop = description.films.get(position);
//        filmYear = filmTop.year;
//        return filmYear;
//    }
//
//    public static double getFilmRating(int position) {
//        FilmTop filmTop = description.films.get(position);
//        filmRating = filmTop.rating;
//        return filmRating;
//    }
//    public static int getFilmCountVote(int position) {
//        FilmTop filmTop = description.films.get(position);
//        countVote = filmTop.ratingVoteCount;
//        return countVote;
//    }
//
//
//    private static String getUrlContent(String urlAdress) {
//        StringBuilder content = new StringBuilder();
//        try {
//            URL url = new URL(urlAdress);
//            URLConnection urlConn = url.openConnection();
//            urlConn.setRequestProperty("x-api-key", apiKey);
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                content.append(line).append("\n");
//            }
//            bufferedReader.close();
//        } catch (Exception e) {
//            System.out.println("Такой город был не найден!");
//        }
//        return content.toString();
//    }
//}
