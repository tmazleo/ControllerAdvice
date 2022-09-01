package br.com.mentorama.exceptions;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/olamundo")
public class MessageController {

    @GetMapping
    public ResponseEntity<String> olaMundo() {
        throw new RecursoInexistenteEx();

    }

}
