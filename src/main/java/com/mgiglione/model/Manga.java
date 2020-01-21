package com.mgiglione.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.HashMap;
        import java.util.Map;
        import com.fasterxml.jackson.annotation.JsonAnyGetter;
        import com.fasterxml.jackson.annotation.JsonAnySetter;
        import com.fasterxml.jackson.annotation.JsonIgnore;
        import com.fasterxml.jackson.annotation.JsonInclude;
        import com.fasterxml.jackson.annotation.JsonProperty;
        import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Manga {

    @JsonProperty("mal_id")
    private Integer malId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("title")
    private String title;
    @JsonProperty("publishing")
    private Boolean publishing;
    @JsonProperty("synopsis")
    private String synopsis;
    @JsonProperty("type")
    private String type;
    @JsonProperty("chapters")
    private Integer chapters;
    @JsonProperty("volumes")
    private Integer volumes;
    @JsonProperty("score")
    private Double score;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("end_date")
    private Object endDate;
    @JsonProperty("members")
    private Integer members;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mal_id")
    public Integer getMalId() {
        return malId;
    }

    @JsonProperty("mal_id")
    public void setMalId(Integer malId) {
        this.malId = malId;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("publishing")
    public Boolean getPublishing() {
        return publishing;
    }

    @JsonProperty("publishing")
    public void setPublishing(Boolean publishing) {
        this.publishing = publishing;
    }

    @JsonProperty("synopsis")
    public String getSynopsis() {
        return synopsis;
    }

    @JsonProperty("synopsis")
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("chapters")
    public Integer getChapters() {
        return chapters;
    }

    @JsonProperty("chapters")
    public void setChapters(Integer chapters) {
        this.chapters = chapters;
    }

    @JsonProperty("volumes")
    public Integer getVolumes() {
        return volumes;
    }

    @JsonProperty("volumes")
    public void setVolumes(Integer volumes) {
        this.volumes = volumes;
    }

    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
    }

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("end_date")
    public Object getEndDate() {
        return endDate;
    }

    @JsonProperty("end_date")
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("members")
    public Integer getMembers() {
        return members;
    }

    @JsonProperty("members")
    public void setMembers(Integer members) {
        this.members = members;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
