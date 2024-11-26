package mk.ukim.finki.lab1.repository;

import mk.ukim.finki.lab1.bootstrap.DataHolder;
import mk.ukim.finki.lab1.model.Album;
import mk.ukim.finki.lab1.model.Artist;
import mk.ukim.finki.lab1.model.Song;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class SongRepository {
    public List<Song> findAll(){
        return DataHolder.songs;
    }
    public Song findByTrackId(Long trackId){
        if(trackId==null){
            return null;
        }
        return DataHolder.songs.stream()
                .filter(s->s.getId().equals(trackId)).findFirst().get();
    }
    public Artist addArtistToSong(Artist artist, Song song){
      DataHolder.songs.stream().filter(s->s.equals(song)).findFirst().get()
               .getPerformers().add(artist);
       return artist;
    }
    public List<Song> searchByText(String text){
            if (text == null || text.isEmpty()) {
                return new ArrayList<>();
            }
            return DataHolder.songs.stream()
                    .filter(song -> song.getTitle().toLowerCase().contains(text.toLowerCase()))
                    .toList();
        }

    public void delete(Long id) {
        DataHolder.songs.removeIf(song -> id.equals(song.getId()));
    }

    public void update(Long id, Song song) {
        DataHolder.songs.removeIf(song1 -> song1.getId().equals(id));
        DataHolder.songs.add(song);
    }

    public Song editSong(Long id, String title, String genre, int releaseYear, Album byId) {
        DataHolder.songs.removeIf(song -> song.getId().equals(id));
        Song song = new Song(id, title, genre, releaseYear, byId);
        DataHolder.songs.add(song);
        return song;
    }
    public Song addSong(String title, String genre, int releaseYear, Album album) {
        Song song = new Song(title, genre, releaseYear, album);
        DataHolder.songs.add(song);
        return song;
    }
}
