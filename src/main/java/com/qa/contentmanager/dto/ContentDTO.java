package com.qa.contentmanager.dto;

import java.util.ArrayList;
import java.util.List;

public class ContentDTO {


    private Long contentID;
    private String title;
    private String contentType;
    private String platform;
    private String status;
    private String postDate;
    private String notes;
    private List<SponsorDTO> sponsor = new ArrayList<>();

    public ContentDTO() {
    }

    public ContentDTO(String title, String contentType, String platform, String status, String postDate, String notes) {
        super();
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

    public List<SponsorDTO> getSponsor() {
        return sponsor;
    }

    public void setSponsor(List<SponsorDTO> sponsor) {
        this.sponsor = sponsor;
    }
}
