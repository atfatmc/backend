package com.sevkiyat.repository.read;

import com.sevkiyat.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonReadRepository extends JpaRepository<Person, Long> {
}