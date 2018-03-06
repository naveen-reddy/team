package org.panthers.team.service

import com.blogspot.toomuchcoding.spock.subjcollabs.Collaborator
import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import org.panthers.team.model.TeamPhotos
import org.panthers.team.repositories.TeamPhotosRepository
import spock.lang.Specification

class TeamPhotosServiceSpec extends Specification{

    @Collaborator
    TeamPhotosRepository photosRepository = Mock(TeamPhotosRepository)

    @Subject
    TeamPhotosService teamPhotosService = new TeamPhotosService(teamPhotosRepository: photosRepository)

    def "get all the photos"(){
        given:
        TeamPhotos teamPhotos = new TeamPhotos( null)
        HashSet hashSet = new HashSet();
        hashSet.add(teamPhotos)

        when:
        Set<TeamPhotos> setOfTeamPhotos = teamPhotosService.getAllPhotos()

        then:
        1 * photosRepository.findPhotosByIdNotNull() >> hashSet
        setOfTeamPhotos != null

    }
}
