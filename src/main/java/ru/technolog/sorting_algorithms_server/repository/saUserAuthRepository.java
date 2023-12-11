package ru.technolog.sorting_algorithms_server.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.technolog.sorting_algorithms_server.entitys.data.saUserAuthData;
@Repository
public interface saUserAuthRepository extends JpaRepository<saUserAuthData, Long> {
    saUserAuthData findByUsername(String username);
    Boolean existsByUsername(String username);
}
