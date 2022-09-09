package com.wesleyscorrea.springcomviacep.resources;

import com.wesleyscorrea.springcomviacep.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        User u = new User(1L, "Wesley", 37715861863L, sdf.parse("07/02/1991"), "Wesley@gmail.com");
        return ResponseEntity.ok().body(u);
    }
}
