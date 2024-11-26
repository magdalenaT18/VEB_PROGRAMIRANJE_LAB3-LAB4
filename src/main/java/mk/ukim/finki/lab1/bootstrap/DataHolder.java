package mk.ukim.finki.lab1.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.lab1.model.Album;
import mk.ukim.finki.lab1.model.Artist;
import mk.ukim.finki.lab1.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Artist> artistList=new ArrayList<>();
    public static List<Song> songs=new ArrayList<>();
    public  static List<Album> albums=new ArrayList<>();

    @PostConstruct
    public void init() {
        Album AfterHours=new Album( "After Hours", "R&B", "2020");
        Album BorntoDie=new Album("Born to Die", "Alternative", "2012");
        Album Fearless=new Album( "Fearless", "Country pop", "2008");
        Album UseYourIllusionI =new Album( "Use Your Illusion I", "Rock", "1991");
        Album DooWopsHooligans=new Album( "Doo-Wops & Hooligans", "R&B/Soul", "2010");
        albums.add(AfterHours);
        albums.add(BorntoDie);
        albums.add(Fearless);
        albums.add(UseYourIllusionI);
        albums.add(DooWopsHooligans);
        artistList.add(new Artist("The " , "Weeknd", "text1"));
        artistList.add(new Artist("Lana" , "Del Ray", "text2"));
        artistList.add(new Artist("Taylor" , "Swift", "text3"));
        artistList.add(new Artist("Guns N' " , "Roses", "text4"));
        artistList.add(new Artist("Bruno" , "Mars", "text5"));

        songs.add(new Song("After Hours", "R&B", 2020,AfterHours));
        songs.add(new Song("Summertime Sadness", "Alternative", 2012, BorntoDie));
        songs.add(new Song( "Love Story", "Country pop", 2008,Fearless));
        songs.add(new Song( "November Rain", "Rock", 1991,UseYourIllusionI));
        songs.add(new Song( "Grenade", "R&B/Soul", 2010,DooWopsHooligans));
    }
}
