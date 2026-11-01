package souza.mangamanagerapi.servive;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import souza.mangamanagerapi.Entity.Manga;
import souza.mangamanagerapi.database.MangaRepository;
import souza.mangamanagerapi.dto.MangaPostRequestBody;
import souza.mangamanagerapi.dto.MangaPutRequestBody;

import java.net.URI;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MangaService {
    private final MangaRepository mangaRepository;

    public List<Manga> listAll() {
        return mangaRepository.findAll();
    }

    public Manga findManga(Long id) {
        return mangaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Not Manga found"));
    }

    public Manga createdManga(MangaPostRequestBody mangaPostRequestBody) {
        if (mangaRepository.findAll().isEmpty()) {
            mangaRepository.resetAutoIncrement();
        }

        if (mangaRepository.findByName(mangaPostRequestBody.getName()).isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Manga Already exists");
        }

        Manga mangaNovo = Manga.builder().name(mangaPostRequestBody.getName()).build();
        return mangaRepository.save(mangaNovo);
    }


    public void remove(Long id) {
        mangaRepository.delete(findManga(id));
    }


    public Manga replace(MangaPutRequestBody mangaPutRequestBody) {
        Manga savedManga = findManga(mangaPutRequestBody.getId());
        Manga manga = Manga.builder()
                .id(savedManga.getId())
                .name(mangaPutRequestBody.getName())
                .build();

        return mangaRepository.save(manga);
    }
}
