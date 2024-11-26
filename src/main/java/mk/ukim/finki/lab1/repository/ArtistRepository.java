package mk.ukim.finki.lab1.repository;

import mk.ukim.finki.lab1.bootstrap.DataHolder;
import mk.ukim.finki.lab1.model.Artist;
import org.springframework.stereotype.Repository;

import java.util.Objects;
import java.util.Optional;
import java.util.List;

@Repository
public class ArtistRepository {
    public List<Artist> findAll(){
        return DataHolder.artistList;
    }
    public Artist findById(Long id){
        return DataHolder.artistList.stream()
                .filter(a-> a.getId().equals(id)).findFirst().get();
    }
}
