package testgroup.filmography.service;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import testgroup.filmography.model.Film;
import testgroup.filmography.model.FilmList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Logger;

@Service
public class KinoPoiskService {

    static String apiurl = "https://kinopoiskapiunofficial.tech/api/v2.2/films/top?type=TOP_250_BEST_FILMS&page=1";
    static String apiKey = "e986c301-acb5-48f5-9b1f-4f2bdde8e62e";
    private static final Logger LOG = Logger.getLogger("Log: ");
    static String output = getUrlContent(apiurl);
    static Gson g = new Gson();

    public FilmList desc = g.fromJson(output, FilmList.class);
    int position = 1;

    public void addJson() {

        System.out.println(output);
        System.out.println("*****************");

        System.out.println("*****************");
        for (Film filmDescr : desc.films) {


            position++;
            filmDescr.setPosition(position);
            System.out.println(filmDescr.getNameEn() + " " + filmDescr.getPosition());

        }
    }

    public static void main(String[] args) {
        KinoPoiskService poiskService = new KinoPoiskService();
        poiskService.addJson();
    }

    private static String getUrlContent(String urlAdress) {
        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL(urlAdress);
            URLConnection urlConn = url.openConnection();
            urlConn.setRequestProperty("x-api-key", apiKey);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Такой город был не найден!");
        }
        return content.toString();
    }
}
