package com.keomala.stattracker.service;

import com.keomala.stattracker.dao.RetrieveDao;
import com.keomala.stattracker.domain.StatInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RetrieveServiceTest {

    private RetrieveService retrieveService;

    private RetrieveDao retrieveDao;

    private StatInfo validStatInfo;

    @BeforeEach
    public void setUp() {
        retrieveDao = mock(RetrieveDao.class);
        retrieveService = new RetrieveService(retrieveDao);
        validStatInfo = new StatInfo();
    }


    @Test
    public void testGetStatInfoById_givenValidId_shouldReturnStatInfo() {
        when(retrieveDao.getStatInfoById(anyInt())).thenReturn(validStatInfo);

        StatInfo actual = retrieveService.getStatInfoById(1);

        assertEquals(validStatInfo, actual);
    }
}