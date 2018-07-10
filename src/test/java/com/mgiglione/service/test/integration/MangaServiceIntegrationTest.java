package com.mgiglione.service.test.integration;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mgiglione.model.Manga;
import com.mgiglione.service.MangaService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MangaServiceIntegrationTest {
    
    @Autowired
    private MangaService mangaService;
    
    @Test
    public void testGetMangasByTitle() {
           List<Manga> mangasByTitle = mangaService.getMangasByTitle("ken");
           assertThat(mangasByTitle).isNotNull().isNotEmpty();
    }

}
