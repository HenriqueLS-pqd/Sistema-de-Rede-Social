package com.redesocial.modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Post {
    private Integer id;
    private Usuario autor;
    private String conteudo;
    private LocalDateTime dataPublicaçao;
    private List<Usuario> curtiddas;
    private List<Comentario> comentarios;
}
