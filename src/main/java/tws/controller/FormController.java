package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.Form;
import tws.repository.FormMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/forms")
@CrossOrigin(origins = "http://localhost:8080")
public class FormController {

    @Autowired
    private FormMapper formMapper;

    @GetMapping("")
    public ResponseEntity<List<Form>> getAll() {
        return ResponseEntity.ok(formMapper.selectAll());
    }

   
    @PostMapping
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Form> insert(@RequestBody Form form) {
    	System.out.println("----------------start");
    	System.out.println(form.getId());
    	System.out.println("----------------end");
    	formMapper.insert(form);
        return ResponseEntity.created(URI.create("http://172.16.40.227:8082/forms/" + form.getId())).body(form);
    }
}
