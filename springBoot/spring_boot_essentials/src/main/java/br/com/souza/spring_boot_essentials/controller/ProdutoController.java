package br.com.souza.spring_boot_essentials.controller;

import br.com.souza.spring_boot_essentials.database.model.ProdutoEntity;
import br.com.souza.spring_boot_essentials.dto.ProdutoDto;
import br.com.souza.spring_boot_essentials.excepcion.NotFoundException;
import br.com.souza.spring_boot_essentials.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor
public class ProdutoController {
    private final ProdutoService produtoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntity> findAll(){
        return produtoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoEntity createProduct(@RequestBody ProdutoDto produtoDto){
        return produtoService.createProduct(produtoDto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoEntity updateProduct (@PathVariable Integer id, @RequestBody ProdutoDto produtoDto) throws NotFoundException {
        return produtoService.updateProdutc(produtoDto, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String removeProdutct(@PathVariable Integer id){
        produtoService.removeProduct(id);
        return "Item com o " + id + "Removido";
    }
}
