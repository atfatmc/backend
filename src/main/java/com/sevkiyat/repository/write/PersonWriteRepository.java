package com.sevkiyat.repository.write;

import com.sevkiyat.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonWriteRepository extends JpaRepository<Person, Long> {
}
