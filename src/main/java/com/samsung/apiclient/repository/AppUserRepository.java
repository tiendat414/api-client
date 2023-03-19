package com.samsung.apiclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.samsung.apiclient.domain.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long>{
	AppUser findByUserName(String userName);
}
