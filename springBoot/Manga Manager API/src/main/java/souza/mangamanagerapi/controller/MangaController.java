package souza.mangamanagerapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import souza.mangamanagerapi.Entity.Manga;
import souza.mangamanagerapi.dto.MangaPostRequestBody;
import souza.mangamanagerapi.dto.MangaPutRequestBody;
import souza.mangamanagerapi.servive.MangaService;

import java.util.List;

@RestController
@RequestMapping("/mangas")
@AllArgsConstructor
public class MangaController {
    MangaService mangaService;

    @GetMapping
    public List<Manga> findAll(){
        return mangaService.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Manga> findAll(@PathVariable Long id){
        return ResponseEntity.ok(mangaService.findManga(id));
    }

    @PostMapping
    public ResponseEntity<Manga> create(@RequestBody MangaPostRequestBody mangaPostRequestBody){
        return ResponseEntity.ok(mangaService.createdManga(mangaPostRequestBody));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Manga> remove(@PathVariable Long id){
        mangaService.remove(id);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping()
    public ResponseEntity<Void> replace(@RequestBody MangaPutRequestBody mangaPutRequestBody){
        mangaService.replace(mangaPutRequestBody);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
