package com.keomala.stattracker.controller;

import com.keomala.stattracker.domain.StatInfo;
import com.keomala.stattracker.service.RetrieveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("/statInfo")
public class RetrieveController {

    private final RetrieveService retrieveService;

    public RetrieveController(RetrieveService retrieveService) {
        this.retrieveService = retrieveService;
    }

    @RequestMapping(value = "/{statId}",
            method = RequestMethod.GET)
    public StatInfo getStatInfoById(int statId) {
        return retrieveService.getStatInfoById(statId);
    }
}
