package mk.ukim.finki.lab1.service.impl;

import mk.ukim.finki.lab1.model.Artist;
import mk.ukim.finki.lab1.model.Song;
import mk.ukim.finki.lab1.repository.AlbumRepository;
import mk.ukim.finki.lab1.repository.ArtistRepository;
import mk.ukim.finki.lab1.repository.SongRepository;
import mk.ukim.finki.lab1.service.ArtistService;
import mk.ukim.finki.lab1.service.SongService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongServiceImpl implements SongService, ArtistService {
    private final ArtistRepository artistRepository;
    private final SongRepository songRepository;
    private final AlbumRepository albumRepository;

    public SongServiceImpl(ArtistRepository artistRepository, SongRepository songRepository, AlbumRepository albumRepository) {
        this.artistRepository = artistRepository;
        this.songRepository = songRepository;
        this.albumRepository=albumRepository;
    }

    @Override
    public List<Artist> listArtists() {
        return artistRepository.findAll();
    }

    @Override
    public Artist ArtistfindById(Long id) {
        return artistRepository.findById(id);
    }

    @Override
    public List<Song> listSongs() {
        return songRepository.findAll();
    }

    @Override
    public Artist addArtistToSong(Artist artist, Song song) {
        return songRepository.addArtistToSong(artist, song);
    }

    @Override
    public Song findByTrackId(Long trackId) {
        return songRepository.findByTrackId(trackId);
    }

    @Override
    public List<Song> searchByText(String text) {
        return songRepository.searchByText(text);
    }

    @Override
    public void deleteSong(Long id) {
        songRepository.delete(id);
    }

    @Override
    public void updateSong(Long id, Song song) {
        songRepository.update(id, song);
    }

    @Override
    public Song addSong(String title, String genre, int releaseYear, Long album) {
        return songRepository.addSong(title, genre, releaseYear, albumRepository.getById(album));
    }

    @Override
    public Song editSong(Long id, String title, String genre, int releaseYear, Long album) {
        return songRepository.editSong(id, title, genre, releaseYear, albumRepository.getById(album));
    }
}
