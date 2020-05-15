package com.SnakeGame_Rest.Controller;


import com.SnakeGame_Rest.Repo.BodyPartRepository;
import com.SnakeGame_Rest.model.BodyPart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="*")
@RestController
public class BodyPartController {
    @Autowired
    private BodyPartRepository bodyPartRepository;

    @GetMapping("/ping")
    public String ping(){
        return "Up";
    }

    @GetMapping("/getAllBodyParts")
    public List<BodyPart> getAllBodyPart(){
        return bodyPartRepository.findAll();
    }

    @RequestMapping(value="/bodyParts",method=RequestMethod.POST)
    public BodyPart SaveBodyPart(@RequestBody BodyPart bodyPart){
        return bodyPartRepository.save(bodyPart);
    }


}
