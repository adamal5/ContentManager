package com.qa.contentmanager.domain;

import javax.persistence.*;

@Entity
public class Content {

    @Id
    @GeneratedValue
    private Long contentID;

    @Column (nullable = false, unique = true)
    private String title;

    @Column
    private String contentType;

    @Column
    private String platform;

    @Column
    private String status;

    @Column
    private String postDate;

    @Column
    private String notes;

    @ManyToOne(targetEntity = Sponsor.class)
    private Sponsor sponsor;

    public Content() {
    }

    public Content(String title, String contentType, String platform, String status, String postDate, String notes) {
        this.title = title;
        this.contentType = contentType;
        this.platform = platform;
        this.status = status;
        this.postDate = postDate;
        this.notes = notes;
    }

    public Long getContentID() {
        return contentID;
    }

    public void setContentID(Long contentID) {
        this.contentID = contentID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getNotes() { return notes; }

    public void setNotes(String notes) { this.notes = notes; }

    public Sponsor getSponsor() { return sponsor; }

    public void setSponsor(Sponsor sponsor) { this.sponsor = sponsor; }
}