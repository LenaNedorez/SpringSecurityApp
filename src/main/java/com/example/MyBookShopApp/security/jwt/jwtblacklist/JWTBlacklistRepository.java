package com.example.MyBookShopApp.security.jwt.jwtblacklist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JWTBlacklistRepository extends JpaRepository<JWTBlacklist,String> {

    JWTBlacklist findByTokenEquals(String token);
}
