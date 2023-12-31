package com.rocket.subject;

import com.rocket.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    Optional<Subject> findByName(String name);
    Optional<Subject> deleteAllByName(String name);
    Optional<Subject> findAllByEnrolledTeachers(User teacher);
}
