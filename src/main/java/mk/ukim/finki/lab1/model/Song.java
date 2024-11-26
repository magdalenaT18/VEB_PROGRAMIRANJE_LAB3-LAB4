package mk.ukim.finki.lab1.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class Song {



    private Long id;

    private String title;
    private String genre;
    private int releaseYear;

    private List<Artist> performers;

    private Album album;

    public Song(String title, String genre, int releaseYear, Album album) {
        this.id = (long) (Math.random() * 1000);
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        performers=new ArrayList<>();
        this.album = album;
    }
    public Song(Long id, String title, String genre, int releaseYear, Album album) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        performers=new ArrayList<>();
        this.album = album;
    }
}
