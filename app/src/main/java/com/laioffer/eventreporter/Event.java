package com.laioffer.eventreporter;

/**
 * Created by chengqian on 8/27/17.
 */

public class Event {
    /**
     * All data for a event.
     */
    private String title;
    private String address;
    private String description;


    private int like;
    private String id;
    private long time;
    private String username;
    private String imgUri;




    private int CommentNumber;


    /**
     * Constructor
     */
    public Event() {}

    public Event(String title, String address, String description) {
        this.title = title;
        this.address = address;
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    /**
     * Getters for private attributes of Event class.
     */


    public String getTitle() {
        return this.title;
    }

    public String getAddress() {
        return this.address;
    }

    public String getDescription() {
        return this.description;
    }

    public int getCommentNumber() {
        return CommentNumber;
    }

    public void setCommentNumber(int commentNumber) {
        CommentNumber = commentNumber;
    }
}
