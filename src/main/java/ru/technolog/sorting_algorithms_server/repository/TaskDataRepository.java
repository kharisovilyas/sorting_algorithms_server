package ru.technolog.sorting_algorithms_server.repository;

import org.springframework.data.repository.CrudRepository;
import ru.technolog.sorting_algorithms_server.entitys.data.saTaskData;

import java.util.Optional;

public interface TaskDataRepository extends CrudRepository<saTaskData,Long> {
    Optional<saTaskData> findById(Long id);
}
