package com.cembo.youtube_api.webApi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cembo.youtube_api.business.abstracts.DataService;
import com.cembo.youtube_api.entities.Data;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class DatasController {
    private final DataService _dataService;

    @PostMapping(name = "create")
    public void create(@RequestBody Data data) {
        _dataService.create(data);
    }

    @PutMapping(name= "update")
    public void update(@RequestBody Data data) {
        _dataService.update(data);
    }
}
