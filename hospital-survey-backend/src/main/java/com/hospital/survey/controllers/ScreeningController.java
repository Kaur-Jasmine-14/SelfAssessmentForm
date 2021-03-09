package com.hospital.survey.controllers;

import com.hospital.survey.models.Screening;
import com.hospital.survey.services.ScreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/screening")
@CrossOrigin(origins = "*")
public class ScreeningController
{
    @Autowired
    private ScreeningService screeningService;

    @PostMapping("/save")
    public void save(Screening screening) {
        screeningService.save(screening);
    }

    @PostMapping("/saveAll")
    public void saveAll(@RequestBody Map<String, String> questions) {

        screeningService.findUpdateAndSaveAll(questions);
    }


}
