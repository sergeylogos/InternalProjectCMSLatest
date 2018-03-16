package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.com.owu.entity.Client;
import ua.com.owu.entity.Course;
import ua.com.owu.service.ClientService;
import ua.com.owu.service.CourseService;

@RestController
public class MyRestController {

    @Autowired
    private ClientService clientService;
    @Autowired
    private CourseService courseService;
//    @Autowired
//    private ClientDTOAdapter clientDTOAdapter;


    @PostMapping("/editNow")
    public void editNow(@RequestBody Client client) {

        System.out.println("client from request \n" + client.getTagsAboutClient());
        client.getTagsAboutClient().forEach(System.out::println);
        clientService.save(client);

    }

    @PostMapping("/liveEditCourse")
    public void liveEditCourse(@RequestBody Course course) {
        System.out.println(course);
        courseService.save(course);
    System.out.println("doneeee");
    }

}
