package com.mgiglione.model;

import java.util.List;

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
@Getter @Setter @NoArgsConstructor
public class MangaResult {

    @JsonProperty("request_hash")
    private String requestHash;
    @JsonProperty("request_cached")
    private Boolean requestCached;
    @JsonProperty("request_cache_expiry")
    private Integer requestCacheExpiry;
    @JsonProperty("results")
    private List<Manga> results = null;
    @JsonProperty("last_page")
    private Integer lastPage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("request_hash")
    public String getRequestHash() {
        return requestHash;
    }

    @JsonProperty("request_hash")
    public void setRequestHash(String requestHash) {
        this.requestHash = requestHash;
    }

    @JsonProperty("request_cached")
    public Boolean getRequestCached() {
        return requestCached;
    }

    @JsonProperty("request_cached")
    public void setRequestCached(Boolean requestCached) {
        this.requestCached = requestCached;
    }

    @JsonProperty("request_cache_expiry")
    public Integer getRequestCacheExpiry() {
        return requestCacheExpiry;
    }

    @JsonProperty("request_cache_expiry")
    public void setRequestCacheExpiry(Integer requestCacheExpiry) {
        this.requestCacheExpiry = requestCacheExpiry;
    }

    @JsonProperty("results")
    public List<Manga> getResults() {
        return results;
    }

    @JsonProperty("mangas")
    public void setResults(List<Manga> mangas) {
        this.results = mangas;
    }

    @JsonProperty("last_page")
    public Integer getLastPage() {
        return lastPage;
    }

    @JsonProperty("last_page")
    public void setLastPage(Integer lastPage) {
        this.lastPage = lastPage;
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
