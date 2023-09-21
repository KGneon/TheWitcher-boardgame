package com.witcheronboard.model;

import jakarta.persistence.*;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable=false, updatable = false)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private EffectEnum effect;
    private Integer effectPowerPoints;
    private Integer effectRollSuccessPoints;
    private String description;
    private String imageUrl;

    public Event() {
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

    public EffectEnum getEffect() {
        return effect;
    }

    public void setEffect(EffectEnum effect) {
        this.effect = effect;
    }

    public Integer getEffectPowerPoints() {
        return effectPowerPoints;
    }

    public void setEffectPowerPoints(Integer effectPowerPoints) {
        this.effectPowerPoints = effectPowerPoints;
    }

    public Integer getEffectRollSuccessPoints() {
        return effectRollSuccessPoints;
    }

    public void setEffectRollSuccessPoints(Integer effectRollSuccessPoints) {
        this.effectRollSuccessPoints = effectRollSuccessPoints;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
