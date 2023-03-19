package com.samsung.apiclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samsung.apiclient.domain.AppUser;
import com.samsung.apiclient.enumtype.Provider;
import com.samsung.apiclient.repository.AppUserRepository;

@Service
public class UserService {
	@Autowired
    private AppUserRepository repo;
     
    public void processOAuthPostLogin(String username) {
        AppUser existUser = repo.findByUserName(username);
         
        if (existUser == null) {
        	AppUser newUser = new AppUser();
            newUser.setUserName(username);
            newUser.setProvider(Provider.KEYCLOAK);
            newUser.setEnable(true);                     
            repo.save(newUser);        
        }
         
    }
}
