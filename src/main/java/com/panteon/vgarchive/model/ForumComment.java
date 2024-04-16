package com.panteon.vgarchive.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "forum_comment")
public class ForumComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int forum_thread;
    private String message_content;
    @ManyToOne
    @JoinColumn(name = "original_poster", referencedColumnName = "id")
    private Users original_poster;
    private Date timestamp_created;
    private int upvotes;

    public ForumComment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getForum_thread() {
        return forum_thread;
    }

    public void setForum_thread(int forum_thread) {
        this.forum_thread = forum_thread;
    }

    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }

    public Users getOriginal_poster() {
        return original_poster;
    }

    public void setOriginal_poster(Users original_poster) {
        this.original_poster = original_poster;
    }

    public Date getTimestamp_created() {
        return timestamp_created;
    }

    public void setTimestamp_created(Date timestamp_created) {
        this.timestamp_created = timestamp_created;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }
}
