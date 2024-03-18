package com.cembo.youtube_api.business.abstracts;

import java.util.List;

import com.cembo.youtube_api.entities.Data;

public interface DataService {
    public void create(Data data);
    public void update(Data data);
    public Data get(int id);
    public List<Data> getAll();
}
