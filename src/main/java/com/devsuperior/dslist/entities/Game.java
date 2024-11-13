package com.devsuperior.dslist.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
//Configura a classe java para ser equivalente a uma tebela do banco relacional
@Table(name = "tb_game")
//Configura o nome da tabela
public class Game {
    @Id
    //Configura o id para ser chave primária do banco
    @GeneratedValue
    //Para o id ser auto incrementável pelo banco
    private Long id;
    private String title;
    private int year;
    private String genre;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescripition;

    public Game() {

    }

    public Game(Long id, String title, int year, String genre, String platform, String imgUrl, String shortDescription, String longDescripition) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platform = platform;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescripition = longDescripition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescripition() {
        return longDescripition;
    }

    public void setLongDescripition(String longDescripition) {
        this.longDescripition = longDescripition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
