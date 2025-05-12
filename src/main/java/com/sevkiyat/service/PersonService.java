package com.sevkiyat.service;

import com.sevkiyat.entity.Person;
import com.sevkiyat.exception.DuplicatePersonException;
import com.sevkiyat.repository.read.PersonReadRepository;
import com.sevkiyat.repository.write.PersonWriteRepository;
import org.springframework.stereotype.Service;
import com.sevkiyat.exception.DuplicatePersonException;

import java.util.List;

@Service
public class PersonService {

    private final PersonWriteRepository writeRepo;
    private final PersonReadRepository readRepo;

    public PersonService(PersonWriteRepository writeRepo, PersonReadRepository readRepo) {
        this.writeRepo = writeRepo;
        this.readRepo = readRepo;
    }

    public Person savePerson(Person person) {
        System.out.println("WRITE repo kullanılıyor");
        if (writeRepo.existsByFirstNameAndLastName(person.getFirstName(), person.getLastName())) {
            throw new DuplicatePersonException("Bu isim ve soyisim zaten kayıtlı.");
        }
        return writeRepo.save(person);
    }

    public List<Person> getAllPersons() {
        System.out.println("READ repo kullanılıyor");
        return readRepo.findAll();
    }
}
