package com.keomala.stattracker.service;

import com.keomala.stattracker.dao.RetrieveDao;
import com.keomala.stattracker.domain.StatInfo;
import org.springframework.stereotype.Service;

@Service
public class RetrieveService {

    private RetrieveDao retrieveDao;

    public RetrieveService(RetrieveDao retrieveDao) {
        this.retrieveDao = retrieveDao;
    }

    public StatInfo getStatInfoById(int statId) {
        return retrieveDao.getStatInfoById(statId);
    }
}
