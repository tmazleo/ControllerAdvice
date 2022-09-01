package br.com.mentorama.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GenericControllerAdvice {

    Logger LOGGER = LoggerFactory.getLogger(GenericControllerAdvice.class);

    @ExceptionHandler({RecursoInexistenteEx.class})
    public ResponseEntity<String> handle(final RecursoInexistenteEx e) {
        final String recursoinexistente = "Recurso Inexistente";
        LOGGER.error(recursoinexistente);
        return new ResponseEntity<>(recursoinexistente, HttpStatus.NOT_FOUND);
    }
}
