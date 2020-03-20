package com.keomala.stattracker.controller;

import com.keomala.stattracker.domain.StatInfo;
import com.keomala.stattracker.service.RetrieveService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class RetrieveControllerTest {

    private RetrieveController retrieveController;

    private RetrieveService retrieveService;

    private StatInfo validStatInfo;

    @BeforeEach
    public void setUp() {
        retrieveService = mock(RetrieveService.class);
        retrieveController = new RetrieveController(retrieveService);
        validStatInfo = new StatInfo();
    }

    @Test
    public void testGetStatInfoById_givenValidId_shouldReturnStatInfo() {
        when(retrieveService.getStatInfoById(anyInt())).thenReturn(validStatInfo);

        StatInfo actual = retrieveController.getStatInfoById(1);

        assertEquals(validStatInfo, actual);
    }
}