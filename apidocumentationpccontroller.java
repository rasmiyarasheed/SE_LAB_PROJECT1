package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Pc;
import com.example.demo.Service.PcService;

/**
 * The PcController class handles HTTP requests related to PC entities.
 */
@RestController
public class PcController {

    @Autowired
    private PcService pcService;

    /**
     * Handles HTTP POST requests to add a PC entity.
     *
     * @param pc The PC entity to be added.
     * @return The PC entity that has been added.
     */
    @PostMapping("/addPcEntity")
    public Pc postDetails(@RequestBody Pc pc) {
        return pcService.saveDetails(pc);
    }

}
