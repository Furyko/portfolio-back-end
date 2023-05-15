package com.julianpalavecino.portfolio.service;


import com.julianpalavecino.portfolio.entity.AboutMe;

public interface AboutMeService {
    AboutMe newAboutMe(AboutMe newAboutMe);
    Iterable<AboutMe> getAll();
    AboutMe modifyAboutMe(AboutMe aboutMe);
    Boolean deleteAboutMe(Long idAboutMe);
}
