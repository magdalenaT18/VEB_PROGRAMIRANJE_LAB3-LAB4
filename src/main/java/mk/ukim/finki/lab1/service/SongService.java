package mk.ukim.finki.lab1.service;

import mk.ukim.finki.lab1.model.Artist;
import mk.ukim.finki.lab1.model.Song;

import java.util.List;
import java.util.Optional;

public interface SongService {
        List<Song> listSongs();
        Artist addArtistToSong(Artist artist, Song song);
        Song findByTrackId(Long trackId);
        List<Song> searchByText(String text);

        void deleteSong(Long id);

        void updateSong(Long id, Song song);
        Song addSong(String title, String genre, int releaseYear, Long Id);

        Song editSong(Long id, String title, String genre, int releaseYear, Long album);
}
