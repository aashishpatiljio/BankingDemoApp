package com.dxc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
