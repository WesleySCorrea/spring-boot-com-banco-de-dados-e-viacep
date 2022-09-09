package com.wesleyscorrea.springcomviacep.config;

import com.wesleyscorrea.springcomviacep.entities.User;
import com.wesleyscorrea.springcomviacep.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        User u1 = new User(null, "Wesley", 37715861863L, sdf.parse("07/02/1991"), "Wesley@gmail.com");
        User u2 = new User(null, "Fulano", 12345678910L, sdf.parse("05/01/1990"), "Fulano@gmail.com");
        User u3 = new User(null, "Cicrano", 1234489150L, sdf.parse("27/10/1975"), "Cicrano@gmail.com");

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
    }
}