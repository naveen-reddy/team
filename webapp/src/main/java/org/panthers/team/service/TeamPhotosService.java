package org.panthers.team.service;

import org.panthers.team.model.TeamPhotos;
import org.panthers.team.repositories.TeamPhotosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Set;
import java.util.logging.Logger;

@Service
public class TeamPhotosService {

    @Autowired
    TeamPhotosRepository teamPhotosRepository;

    public Set<TeamPhotos> getAllPhotos(){
        return teamPhotosRepository.findPhotosByIdNotNull();
    }

    public void setPhoto(MultipartFile teamPhotos){
        TeamPhotos teamPhotos1= new TeamPhotos();
        try {
            byte[] bytes = teamPhotos.getBytes();
            teamPhotos1.setPhoto(bytes);
        }catch (Exception e){
            System.out.print(e);
        }
        TeamPhotos teamPhotosObect = new TeamPhotos();

        teamPhotosRepository.save(teamPhotos1);
    }
}
