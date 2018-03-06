package org.panthers.team.repositories;

import org.panthers.team.model.TeamPhotos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.util.Set;

public interface TeamPhotosRepository extends JpaRepository<TeamPhotos, Integer>{

    //get list of all photos
    public Set<TeamPhotos> findPhotosByIdNotNull();

//    @Modifying
//    @Transactional
//    public TeamPhotos save(TeamPhotos teamPhotos);

}
