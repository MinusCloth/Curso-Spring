package com.devsuperior.dslist.entitys;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name="game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    @Column(columnDefinition = "TEXT")
    private String shortDescription;
    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Game() {}

    public Game(String longDescription, String shortDescription, String imgUrl, String platform, Double score, String genre, Integer year, String title, Long id) {
        this.longDescription = longDescription;
        this.shortDescription = shortDescription;
        this.imgUrl = imgUrl;
        this.score=score;
        this.platforms = platform;
        this.genre = genre;
        this.year = year;
        this.title = title;
        this.id = id;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platform) {
        this.platforms = platform;
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

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game games = (Game) o;
        return Objects.equals(id, games.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
