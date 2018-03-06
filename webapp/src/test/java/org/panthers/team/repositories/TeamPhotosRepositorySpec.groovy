package org.panthers.team.repositories

import org.panthers.team.model.TeamPhotos
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import spock.lang.Specification
@DataJpaTest
class TeamPhotosRepositorySpec extends Specification{

    @Autowired
    TeamPhotosRepository photosRepository

    def "get all the photos saved in repo"(){

        given:
        TeamPhotos teamPhotos = new TeamPhotos( null)

        when:
        TeamPhotos teamPhotos1 = (TeamPhotos)photosRepository.save(teamPhotos)

        then:
        teamPhotos1 != null
        teamPhotos1.id == 1
    }
}
