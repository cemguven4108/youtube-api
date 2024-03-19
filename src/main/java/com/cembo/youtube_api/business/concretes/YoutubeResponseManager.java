package com.cembo.youtube_api.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cembo.youtube_api.business.abstracts.YoutubeResponseService;
import com.cembo.youtube_api.dataAccess.YoutubeResponseRepository;
import com.cembo.youtube_api.entities.YoutubeResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class YoutubeResponseManager implements YoutubeResponseService {

    private final YoutubeResponseRepository _youtubeResponseRepository;

    @Override
    public void create(YoutubeResponse data) {
    }

    @Override
    public void update(YoutubeResponse data) {
    }

    @Override
    public YoutubeResponse get(String id) {
        boolean result = _checkIfParameterIsNull(id);

        if (result) throw new NullPointerException();

        return _youtubeResponseRepository.findById(id).orElseThrow();
    }

    @Override
    public List<YoutubeResponse> getAll() {
        return _youtubeResponseRepository.findAll();
    }

    private boolean _checkIfParameterIsNull(Object obj) {
        if (obj == null) {
            return true;
        }
        return false;
    }
}
