package com.cembo.youtube_api.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cembo.youtube_api.business.abstracts.DataService;
import com.cembo.youtube_api.dataAccess.DataRepository;
import com.cembo.youtube_api.entities.Data;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DataManager implements DataService {

    private final DataRepository _dataRepository;

    @Override
    public void create(Data data) {
        _dataRepository.save(data);
    }

    @Override
    public void update(Data data) {
        _dataRepository.findById(data.getId());
    }

    @Override
    public Data get(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public List<Data> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    
}
