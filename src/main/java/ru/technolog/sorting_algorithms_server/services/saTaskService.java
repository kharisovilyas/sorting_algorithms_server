package ru.technolog.sorting_algorithms_server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.technolog.sorting_algorithms_server.entitys.dto.dtoTask;
import ru.technolog.sorting_algorithms_server.repository.saArrayDataRepository;
import ru.technolog.sorting_algorithms_server.repository.saSortedArrayDataRepository;
import ru.technolog.sorting_algorithms_server.repository.saTaskDataRepository;

@Service
public class saTaskService {
    @Autowired
    private saTaskDataRepository taskDataRepository;
    @Autowired
    private saArrayDataRepository arrayDataRepository;
    @Autowired
    private saSortedArrayDataRepository sortedArrayDataRepository;


    public ResponseEntity<dtoTask> fetchTask(Long taskId){
        /*if(arrayDataRepository.existsById(taskId) && sortedArrayDataRepository.existsById(taskId)){
            return ResponseEntity.ok(dtoTask);
        }
        else{
            return
        }*/
        return null;
    }
}
