package com.julianpalavecino.portfolio.service;


import com.julianpalavecino.portfolio.entity.AboutMe;

import java.util.Optional;

public interface AboutMeService {
    AboutMe newAboutMe(AboutMe newAboutMe);
    Iterable<AboutMe> getAll();
    Optional<AboutMe> getById(Long idAboutMe);
    AboutMe modifyAboutMe(AboutMe aboutMe);
    Boolean deleteAboutMe(Long idAboutMe);
}
