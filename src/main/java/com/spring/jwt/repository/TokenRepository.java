package com.spring.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.jwt.entity.Token;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long>{

}
