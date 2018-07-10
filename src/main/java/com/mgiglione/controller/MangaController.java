package com.mgiglione.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgiglione.model.Manga;
import com.mgiglione.service.MangaService;

@RestController
@RequestMapping(value = "/manga")
public class MangaController {

    Logger logger = LoggerFactory.getLogger(MangaController.class);

    @Autowired
    private MangaService mangaService;

    // @RequestMapping(value = "/deferred", method = RequestMethod.POST)
    // public DeferredResult<ResponseEntity<?>> timeDeferred(@RequestBody String body) {
    // logger.info("Deferred time request"+body);
    // DeferredResult<ResponseEntity<?>> result = new DeferredResult<>();
    //
    // new Thread(() -> {
    // result.setResult(ResponseEntity.ok("{\"ciao\": \"mondo\"}"));
    // }, "MyThread-" + counter.incrementAndGet()).start();
    //
    // return result;
    // }

    // @RequestMapping(value = "/completableFuture", method = RequestMethod.POST)
    // public CompletableFuture<String> completableFuture(@RequestBody String body) {
    // logger.info("CompletableFuture time request"+body);
    // CompletableFuture<String> result = new CompletableFuture<>();
    //
    // new Thread(() -> {
    // result.complete("{\"ciao\": \"mondo\"}");
    // }, "MyThread-" + counter.incrementAndGet()).start();
    //
    // asyncService.hello();
    //
    // return result;
    // }

    @RequestMapping(value = "/sync/{title}", method = RequestMethod.GET)
    public @ResponseBody List<Manga> searchSync(@PathVariable(name="title") String title) {
        return mangaService.getMangasByTitle(title);
    }

}
