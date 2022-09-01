package br.com.mentorama.exceptions;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;

@RestController
@RequestMapping("/exceptions")
public class Controller {

    final static Logger log = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/get1")
    public ResponseEntity<String> get1() {
        throw new RecursoInexistenteEx();

    }
    @GetMapping("/get2")
    public ResponseEntity<String> get2() {
        throw new RecursoInexistenteEx();
    }




}
