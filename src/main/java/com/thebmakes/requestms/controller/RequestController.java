package com.thebmakes.requestms.controller;

import com.thebmakes.requestms.entity.Request;
import com.thebmakes.requestms.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/requests")
public class RequestController {

    @Autowired
    private RequestService requestService;

    @GetMapping("")
    public List<Request> findAll() {
        return requestService.findAll();
    }

    @GetMapping("{id}")
    public Request findById(@PathVariable String id) {
        return requestService.findById(id);
    }

    @PostMapping("")
    public Request save(@RequestBody Request project) {
        return requestService.save(project);
    }

    @PutMapping("")
    public Request update(@RequestBody Request project) {
        return requestService.update(project);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        requestService.delete(id);
    }

   /* @GetMapping("/users/{userId}")
    public List<Request> getUserProjects(@PathVariable String userId) {
        return requestService.findByUsersContains(userId);
    }

    @GetMapping("/users/{userId}/projects/{projectId}")
    public boolean isUserInProject(@PathVariable String userId, @PathVariable String projectId) {
        return requestService.isUserInProject(userId, projectId);
    }

    @DeleteMapping("/users/{userId}/projects/{projectId}")
    public boolean removeUserFromProject(@PathVariable String userId, @PathVariable String projectId) {
        return requestService.removeUserFromProject(userId, projectId);
    }
*/

}
