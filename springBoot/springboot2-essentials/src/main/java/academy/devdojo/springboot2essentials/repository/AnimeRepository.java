package academy.devdojo.springboot2essentials.repository;

import academy.devdojo.springboot2essentials.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.Optional;

public interface AnimeRepository extends JpaRepository<Anime, Long>{
    Optional<Anime> findByName(String name);

    @Modifying
    @Transactional
    @Query(value = "TRUNCATE TABLE anime", nativeQuery = true)
    void truncateTable();
}
