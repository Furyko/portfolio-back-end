package com.julianpalavecino.portfolio.service;

import com.julianpalavecino.portfolio.entity.Contact;
import com.julianpalavecino.portfolio.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact newContact(Contact newContact) {
        return contactRepository.save(newContact);
    }

    @Override
    public Iterable<Contact> getAll() {
        return this.contactRepository.findAll();
    }

    @Override
    public Contact modifyContact(Contact contact) {
        Optional<Contact> foundContact = this.contactRepository.findById(contact.getIdContact());
        if (foundContact.get() != null) {
            foundContact.get().setName(contact.getName());
            foundContact.get().setData(contact.getData());
            foundContact.get().setUrl(contact.getUrl());
            return this.newContact(foundContact.get());
        }
        return null;
    }

    @Override
    public Boolean deleteContact(Long idContact) {
        this.contactRepository.deleteById(idContact);
        return true;
    }
}
