package com.mgiglione.service.test.unit;

import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mgiglione.controller.MangaController;
import com.mgiglione.model.Manga;
import com.mgiglione.service.MangaService;


@RunWith(SpringRunner.class)
@WebMvcTest(MangaController.class)
public class MangaControllerUnitTestMockMvc {

    
    @Autowired
    MockMvc mockMvc;
    
    @Autowired
    ObjectMapper objectMapper;

    
    @MockBean
    MangaService mangaService;
    
    @Test
    public void testSearchSync() throws Exception {
        Manga manga1=Manga.builder().title("Hokuto no ken").description("The year is 199X. The Earth has been devastated by nuclear war...").build();
        Manga manga2=Manga.builder().title("Yumekui Kenbun").description("For those who suffer nightmares, help awaits at the Ginseikan Tea House, where patrons can order much more than just Darjeeling. Hiruko is a special kind of a private investigator. He's a dream eater....").build();
        
        List<Manga> mangas=new ArrayList<>();
        mangas.add(manga1);
        mangas.add(manga2);
        
        //Mocking service
        when(mangaService.getMangasByTitle(any(String.class))).thenReturn(mangas);
        
        mockMvc.perform(get("/manga/sync/ken")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$[0].title", is("Hokuto no ken")))
            .andExpect(jsonPath("$[1].title", is("Yumekui Kenbun")));
    }
    
}
