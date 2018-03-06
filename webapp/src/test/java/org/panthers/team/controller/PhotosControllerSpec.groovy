package org.panthers.team.controller

import com.blogspot.toomuchcoding.spock.subjcollabs.Collaborator
import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import org.panthers.team.model.TeamPhotos
import org.panthers.team.service.TeamPhotosService
import org.springframework.beans.factory.annotation.Autowire
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder
import spock.lang.Specification

class PhotosControllerSpec extends Specification{

    @Collaborator
    TeamPhotosService teamPhotosService= Mock(TeamPhotosService)
    //creating a mock but we still have to associate this mock to controller
    @Subject
    PhotosController photosController = new PhotosController(teamPhotosService: teamPhotosService)
    //now we have controller lets resolve dependencies by associating mock to controller
    @Autowired
    def mockMvc = MockMvcBuilders.standaloneSetup(photosController).build()
    //now we can create applicationcontext ourself by using mockMVC which is an entry point for mvc
    def "get list of all photos"(){
        given:
        TeamPhotos teamPhotos = new TeamPhotos( null)
        HashSet hashSet = new HashSet();
        hashSet.add(teamPhotos)

        when:
        def response = mockMvc.perform(MockMvcRequestBuilders.get('/photos'))
        // this helps to perform request
        then:
        1 *  teamPhotosService.getAllPhotos() >> hashSet
        response != null
    }

}
