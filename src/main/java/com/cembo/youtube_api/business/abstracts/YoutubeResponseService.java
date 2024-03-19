package com.cembo.youtube_api.business.abstracts;

import java.util.List;

import com.cembo.youtube_api.entities.YoutubeResponse;

public interface YoutubeResponseService {
    public void create(YoutubeResponse data);
    public void update(YoutubeResponse data);
    public YoutubeResponse get(String id);
    public List<YoutubeResponse> getAll();
}
