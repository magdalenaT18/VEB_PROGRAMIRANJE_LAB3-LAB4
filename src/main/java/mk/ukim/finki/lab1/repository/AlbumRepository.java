package mk.ukim.finki.lab1.repository;

import lombok.Data;
import mk.ukim.finki.lab1.bootstrap.DataHolder;
import mk.ukim.finki.lab1.model.Album;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlbumRepository {
    public List<Album> findAll(){
        return DataHolder.albums;

    }
    public Album getById(Long id){
        return DataHolder.albums.stream().filter(a->a.getId().equals(id)).findFirst().get();
    }
}
