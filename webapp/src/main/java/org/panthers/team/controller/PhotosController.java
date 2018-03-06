package org.panthers.team.controller;

import org.panthers.team.model.TeamPhotos;
import org.panthers.team.service.TeamPhotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Set;

@RestController
public class PhotosController {

    @Autowired
    TeamPhotosService teamPhotosService;

    //get list of all the photos for panthers team
    @GetMapping("/photos")
    public Set<TeamPhotos> getAllPhotos(){
        return teamPhotosService.getAllPhotos();

    }

    //set photo
    @PostMapping("/photo")
    public void setPhoto(@RequestParam("teamPhotos") MultipartFile teamPhotos){
        teamPhotosService.setPhoto(teamPhotos);
    }
}
