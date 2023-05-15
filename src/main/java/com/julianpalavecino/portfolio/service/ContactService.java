package com.julianpalavecino.portfolio.service;


import com.julianpalavecino.portfolio.entity.Contact;

public interface ContactService {
    Contact newContact(Contact newContact);
    Iterable<Contact> getAll();
    Contact modifyContact(Contact contact);
    Boolean deleteContact(Long idContact);
}
