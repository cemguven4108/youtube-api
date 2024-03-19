package com.cembo.youtube_api.webApi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cembo.youtube_api.business.abstracts.YoutubeResponseService;
import com.cembo.youtube_api.entities.YoutubeResponse;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class YoutubeResponsesController {
    private final YoutubeResponseService _youtubeResponseService;

    @PostMapping(name = "create")
    public void create(@RequestBody YoutubeResponse data) {
        _youtubeResponseService.create(data);
    }

    @PutMapping(name = "update")
    public void update(@RequestBody YoutubeResponse data) {
        _youtubeResponseService.update(data);
    }

    @GetMapping(name = "get")
    public YoutubeResponse get(@RequestParam String id) {
        return _youtubeResponseService.get(id);
    }

}
