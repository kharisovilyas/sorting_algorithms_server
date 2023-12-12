package ru.technolog.sorting_algorithms_server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.technolog.sorting_algorithms_server.entitys.data.saTaskData;
import ru.technolog.sorting_algorithms_server.entitys.dto.dtoTask;
import ru.technolog.sorting_algorithms_server.repository.ArrayDataRepository;
import ru.technolog.sorting_algorithms_server.repository.SortedArrayDataRepository;
import ru.technolog.sorting_algorithms_server.repository.TaskDataRepository;
import ru.technolog.sorting_algorithms_server.response.ApiResponse;

@Service
public class saTaskService {
    @Autowired
    private TaskDataRepository taskDataRepository;
    @Autowired
    private ArrayDataRepository arrayDataRepository;
    @Autowired
    private SortedArrayDataRepository sortedArrayDataRepository;


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
