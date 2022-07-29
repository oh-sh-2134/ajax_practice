package lab_tutorial.ajax.controller;

import lab_tutorial.ajax.dto.dataDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {

    @PostMapping("/sendData")
    public ResponseEntity send(@RequestBody dataDto dataDto){
        System.out.println("dataDto = " + dataDto);
        return new ResponseEntity(HttpStatus.OK);
    }

}
