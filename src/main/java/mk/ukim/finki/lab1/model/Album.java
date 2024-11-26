package mk.ukim.finki.lab1.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class Album {


    private Long id;
    private String name;
    private String genre;
    private String releaseYear;


    public Album(String name, String genre, String releaseYear) {
        this.id = (long) (Math.random() * 1000);
        this.name = name;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }
}
