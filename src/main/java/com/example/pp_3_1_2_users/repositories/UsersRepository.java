package com.example.pp_3_1_2_users.repositories;

import com.example.pp_3_1_2_users.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersRepository extends JpaRepository<User, Long> {
}
