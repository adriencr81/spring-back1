package com.isika.projet.adrien.springbackpj4.controleur;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.isika.projet.adrien.springbackpj4.dao.UserRepository;
import com.isika.projet.adrien.springbackpj4.modele.User;

@RestController
@RequestMapping(path="/compte")
public class UserControleur {
	
	@Autowired
	private UserRepository userRepository;

	@PostMapping(path="/ajouterUser")
    public ResponseEntity<Void> creerUser(@RequestBody User user) {
        User userAjoute = userRepository.save(user);

             if (userAjoute == null)
                        return ResponseEntity.noContent().build();

                URI uri = ServletUriComponentsBuilder
                        .fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(userAjoute.getId())
                        .toUri();

                return ResponseEntity.created(uri).build(); 
    }


    @GetMapping(path="/listerLesUser")  
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
