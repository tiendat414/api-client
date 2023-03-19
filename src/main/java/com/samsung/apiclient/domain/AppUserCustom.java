package com.samsung.apiclient.domain;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;

public class AppUserCustom implements OidcUser {
	@Autowired
	DefaultOidcUser oidcUser;
	
	@Override
	public Map<String, Object> getAttributes() {
		// TODO Auto-generated method stub
		return oidcUser.getAttributes();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return oidcUser.getAuthorities();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return oidcUser.getName();
	}

	@Override
	public Map<String, Object> getClaims() {
		// TODO Auto-generated method stub
		return oidcUser.getClaims();
	}

	@Override
	public OidcUserInfo getUserInfo() {
		// TODO Auto-generated method stub
		return oidcUser.getUserInfo();
	}

	@Override
	public OidcIdToken getIdToken() {
		// TODO Auto-generated method stub
		return oidcUser.getIdToken();
	}
	
	public String getEmail() {
		return oidcUser.getAttribute("email");
	}


}
