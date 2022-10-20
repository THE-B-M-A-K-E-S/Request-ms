package com.thebmakes.requestms.service;

import com.thebmakes.requestms.entity.Request;
import com.thebmakes.requestms.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {
    @Autowired
    private RequestRepository requestRepository;

    public List<Request> findAll() {
        return requestRepository.findAll();
    }

    public Request findById(String id) {
        return requestRepository.findById(id).get();
    }

    public Request save(Request request) {
        return requestRepository.save(request);
    }

    public Request update(Request request) {
        return requestRepository.save(request);
    }

    public void delete(String id) {
        requestRepository.deleteById(id);
    }

   /* public List<Request> findByUsersContains(String userId) {
        return requestRepository.findByUsersContains(userId);
    } */

   /* public boolean isUserInProject(String userId, String requestId) {
        Request request = findById(requestId);
        return request.getUsers().contains(userId);
    }

    public boolean removeUserFromProject(String userId, String requestId) {
        Request request = findById(requestId);
        if (request.getUsers().contains(userId)) {
            request.getUsers().remove(userId);
            requestRepository.save(request);
            return true;
        }
        return false;
    } */
}
