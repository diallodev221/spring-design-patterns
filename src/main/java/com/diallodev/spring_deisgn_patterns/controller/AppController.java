package com.diallodev.spring_deisgn_patterns.controller;

import com.diallodev.spring_deisgn_patterns.builder.Contact;
import com.diallodev.spring_deisgn_patterns.factory.Pet;
import com.diallodev.spring_deisgn_patterns.factory.PetFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private final PetFactory petFactory;

    public AppController(PetFactory petFactory) {
        this.petFactory = petFactory;
    }

    @PostMapping("/pets/{type}/{name}")
    public Pet adoptPet(@PathVariable String type, @PathVariable String name) {
        Pet pet = petFactory.createPet(type);
        pet.setName(name);
        pet.feed();
        return pet;
    }

    @PostMapping("contact")
    public Contact createContact(@RequestParam(required = false) String firstName,
                                 @RequestParam(required = false) String lastName,
                                 @RequestParam(required = false) String emailAddress
                                 ) {

        return Contact.builder()
                .firstName(firstName)
                .lastName(lastName)
                .emailAddress(emailAddress)
                .build();

    }
}
