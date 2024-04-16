package com.panteon.vgarchive.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "collections_item")
public class CollectionsItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date added_at;
    private int game_id;
    private int collection;
    private String description;

    public CollectionsItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAdded_at() {
        return added_at;
    }

    public void setAdded_at(Date added_at) {
        this.added_at = added_at;
    }

    public int getGame_id() {
        return game_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

