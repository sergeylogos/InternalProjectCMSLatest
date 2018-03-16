package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.owu.service.ApplicationService;
import ua.com.owu.service.ClientService;
import ua.com.owu.service.CourseService;
import ua.com.owu.service.GroupService;

@Controller
public class RouteController {


    @Autowired
    private ApplicationService applicationService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private ClientService clientService;
    @Autowired
    private GroupService groupService;


    @GetMapping("/")
    public String starter(Model model) {

        model.addAttribute("clients", clientService.findAll());
        model.addAttribute("courses", courseService.findAll());
        model.addAttribute("groups", groupService.findAll());
        model.addAttribute("applications", applicationService.findAll());

        return "index";
    }

    @GetMapping("/adminPage")
    public String adminPage(Model model) {

        model.addAttribute("clients", clientService.findAll());
        model.addAttribute("courses", courseService.findAll());
        model.addAttribute("groups", groupService.findAll());
        return "adminPage";
    }

    @GetMapping("/showAllApplications")
    public String showAllApplications(Model model) {
        model.addAttribute("clients", clientService.findAll());
        model.addAttribute("courses", courseService.findAll());
        model.addAttribute("groups", groupService.findAll());
        model.addAttribute("applications", applicationService.findAll());
        return "showAllApplicationsPage";
    }

    @GetMapping("/showAllClients")
    public String showAllClients(Model model) {

        model.addAttribute("courses", courseService.findAll());
        model.addAttribute("groups", groupService.findAll());
        model.addAttribute("clients", clientService.findAll());
        return "showAllClientsPage";
    }

    @GetMapping("/showAllCourses")
    public String showAllCourses(Model model) {

//        model.addAttribute("clients", clientService.findAll());
        model.addAttribute("courses", courseService.findAll());
//        model.addAttribute("groups", groupService.findAll());
        return "showAllCoursesPage";
    }

    @GetMapping("/showAllGroups")
    public String showAllGroups(Model model) {

        model.addAttribute("courses", courseService.findAll());
        model.addAttribute("clients", clientService.findAll());
        model.addAttribute("groups", groupService.findAll());
        return "showAllGroupsPage";
    }


}
