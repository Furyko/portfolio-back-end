package com.julianpalavecino.portfolio.service;

import com.julianpalavecino.portfolio.entity.AboutMe;
import com.julianpalavecino.portfolio.repository.AboutMeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AboutMeServiceImpl implements AboutMeService {
    @Autowired
    private AboutMeRepository aboutMeRepository;

    @Override
    public AboutMe newAboutMe(AboutMe newAboutMe) {
        return aboutMeRepository.save(newAboutMe);
    }

    @Override
    public Iterable<AboutMe> getAll() {
        return this.aboutMeRepository.findAll();
    }

    @Override
    public Optional<AboutMe> getById(Long idAboutMe) {
        return this.aboutMeRepository.findById(idAboutMe);
    }

    @Override
    public AboutMe modifyAboutMe(AboutMe aboutMe) {
        Optional<AboutMe> foundAboutMe = this.aboutMeRepository.findById(aboutMe.getIdAboutMe());
        if (foundAboutMe.get() != null) {
            foundAboutMe.get().setFullname(aboutMe.getFullname());
            foundAboutMe.get().setPresentation(aboutMe.getPresentation());
            foundAboutMe.get().setProfession(aboutMe.getProfession());
            foundAboutMe.get().setProfilePhoto(aboutMe.getProfilePhoto());
            return this.newAboutMe(foundAboutMe.get());
        }
        return null;
    }

    @Override
    public Boolean deleteAboutMe(Long idAboutMe) {
        this.aboutMeRepository.deleteById(idAboutMe);
        return true;
    }
}
