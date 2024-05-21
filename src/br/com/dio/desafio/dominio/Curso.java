package br.com.dio.desafio.dominio;

public class Curso {

   private String titulo;
   int cargaHoraria;
   private String descricao;

    public Curso() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;


    }
}
