package com.mgiglione.service.test.unit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.mgiglione.controller.MangaController;
import com.mgiglione.model.Manga;
import com.mgiglione.service.MangaService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MangaControllerUnitTest {

    @Autowired
    MangaController mangaController;

    @MockBean
    MangaService mangaService;

    
    
    @Test
    public void testSearchSync(){
        Manga manga1=Manga.builder().title("Hokuto no ken").description("The year is 199X. The Earth has been devastated by nuclear war...").build();
        Manga manga2=Manga.builder().title("Yumekui Kenbun").description("For those who suffer nightmares, help awaits at the Ginseikan Tea House, where patrons can order much more than just Darjeeling. Hiruko is a special kind of a private investigator. He's a dream eater....").build();
        
        List<Manga> mangas=new ArrayList<>();
        mangas.add(manga1);
        mangas.add(manga2);
        
        //Mocking service
        when(mangaService.getMangasByTitle(any(String.class))).thenReturn(mangas);
        
        List<Manga> response = mangaController.searchSync("ken");
        assertThat(response.size()).isEqualTo(mangas.size());
        
        
    }
    


}
