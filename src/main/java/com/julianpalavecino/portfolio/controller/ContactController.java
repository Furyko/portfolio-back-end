package com.julianpalavecino.portfolio.controller;

import com.julianpalavecino.portfolio.entity.Contact;
import com.julianpalavecino.portfolio.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
public class ContactController {
    @Autowired
    private ContactService contactService;

    @PostMapping("/new")
    public Contact newContact(@RequestBody Contact newContact){
        return this.contactService.newContact(newContact);
    }

    @GetMapping("/all")
    public Iterable<Contact> getAll() {
        return contactService.getAll();
    }

    @PostMapping("/update")
    public Contact updateContact(@RequestBody Contact contact) {
        return this.contactService.modifyContact(contact);
    }

    @PostMapping(value = "/{idContact}")
    public Boolean deleteContact(@PathVariable(value="idContact") Long idContact) {
        return this.contactService.deleteContact(idContact);
    }
}
