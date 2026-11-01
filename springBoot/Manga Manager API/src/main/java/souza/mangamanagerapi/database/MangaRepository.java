package souza.mangamanagerapi.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import souza.mangamanagerapi.Entity.Manga;

import javax.transaction.Transactional;
import java.util.Optional;

public interface MangaRepository extends JpaRepository<Manga, Long> {
    Optional<Manga> findByName(String name);

    @Transactional
    @Modifying
    @Query(value = "ALTER TABLE manga AUTO_INCREMENT = 1", nativeQuery = true)
    void resetAutoIncrement();
}
