package com.mgiglione.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mgiglione.utils.RequestResponseLoggingInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mgiglione.model.Manga;
import com.mgiglione.model.MangaResult;

@Service
public class MangaService {

    Logger logger = LoggerFactory.getLogger(MangaService.class);
    private static final String MANGA_SEARCH_URL="https://api.jikan.moe/v3/search/manga?q=";


    @Autowired
    RestTemplate restTemplate;
    
    
    public List<Manga> getMangasByTitle(String title) {
        ResponseEntity<MangaResult> result = restTemplate.getForEntity(MANGA_SEARCH_URL+title, MangaResult.class);
        return result.getBody().getResults();
    }

}
