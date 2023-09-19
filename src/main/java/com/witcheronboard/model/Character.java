package com.witcheronboard.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Character implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable=false, updatable = false)
    private Integer id;
    private String name;
    private String origin;
    private String charClass;
    private Integer attackPoints;
    private Integer magicPoints;
    private Integer healthPoints;
    private Integer diceRollPoints;
    private String imageUrl;

    public Character() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public Integer getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(Integer attackPoints) {
        this.attackPoints = attackPoints;
    }

    public Integer getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(Integer magicPoints) {
        this.magicPoints = magicPoints;
    }

    public Integer getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(Integer healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Integer getDiceRollPoints() {
        return diceRollPoints;
    }

    public void setDiceRollPoints(Integer diceRollPoints) {
        this.diceRollPoints = diceRollPoints;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
