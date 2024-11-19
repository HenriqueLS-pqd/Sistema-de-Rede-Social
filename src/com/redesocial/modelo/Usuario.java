package com.redesocial.modelo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Usuario {
    private Integer id;
    private String nome;
    private String usarname;
    private String email;
    private String senha;
    private LocalDateTime dataCadastro;
    private List<Usuario> amigos;
    private List<Post> posts;

    public Usuario(String nome, String usarname, String email, String senha, LocalDateTime dataCadastro, List<Usuario> amigos, List<Post> posts) {
        this.nome = nome;
        this.usarname = usarname;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
        this.amigos = amigos;
        this.posts = posts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsarname() {
        return usarname;
    }

    public void setUsarname(String usarname) {
        this.usarname = usarname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Usuario> amigos) {
        this.amigos = amigos;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id) && Objects.equals(nome, usuario.nome) && Objects.equals(usarname, usuario.usarname) && Objects.equals(email, usuario.email) && Objects.equals(senha, usuario.senha) && Objects.equals(dataCadastro, usuario.dataCadastro) && Objects.equals(amigos, usuario.amigos) && Objects.equals(posts, usuario.posts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, usarname, email, senha, dataCadastro, amigos, posts);
    }
    public void adicionarAmigo(Usuario amigo) {
        if (amigo != null && !this.amigos.contains(amigo)) {
            this.amigos.add(amigo);
            System.out.println(amigo.nome + " foi adicionado como amigo de " + this.nome);
        } else {
            System.out.println("Não foi possível adicionar " + amigo.nome + " como amigo.");
        }
    }

    public void removerAmigo(Usuario amigo){
        if (amigo != null && this.amigos.contains(amigo)) {
            this.amigos.remove(amigo); // Remove o amigo da lista
            System.out.println(amigo.getNome() + " foi removido como amigo de " + this.getNome());
        } else {
            System.out.println("Não foi possível remover " + amigo.getNome() + " como amigo.");
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", usarname='" + usarname + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", dataCadastro=" + dataCadastro +
                ", amigos=" + amigos +
                ", posts=" + posts +
                '}';
    }
}
