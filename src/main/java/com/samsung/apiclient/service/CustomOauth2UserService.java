package com.samsung.apiclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
//import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import com.samsung.apiclient.domain.AppUser;
import com.samsung.apiclient.domain.AppUserCustom;
import com.samsung.apiclient.repository.AppUserRepository;
 
@Service
public class CustomOauth2UserService extends DefaultOAuth2UserService {
	@Autowired
	AppUserRepository appUserRepository;
	
	@Override
	public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
		// TODO Auto-generated method stub
		OidcUser user = (OidcUser) super.loadUser(userRequest);
//		String username = user.getName();
//		AppUser app = appUserRepository.findByUserName(username);
		AppUserCustom custom = new AppUserCustom();
		return custom;
	}
}
