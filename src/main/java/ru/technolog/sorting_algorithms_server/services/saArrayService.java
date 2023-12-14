package ru.technolog.sorting_algorithms_server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.technolog.sorting_algorithms_server.entitys.data.saArraysData;
import ru.technolog.sorting_algorithms_server.entitys.dto.dtoArrays;
import ru.technolog.sorting_algorithms_server.repository.saArrayDataRepository;
import ru.technolog.sorting_algorithms_server.response.ApiResponse;
/*Создание cервиса для добавления сущностей в базу данных*/
@Service
public class saArrayService {
    @Autowired
    private saArrayDataRepository arrayDataRepository;


    public ResponseEntity<ApiResponse> addArray(dtoArrays arraysDTO){
        saArraysData arraysData = new saArraysData();
        arraysData.setArrayData(arraysDTO.getArray_data());
        arraysData.setArrayId(arraysDTO.getArray_id());
        arraysData.setStatusOfLoad(arraysDTO.isStatusOfLoad());
        arrayDataRepository.save(arraysData);

        return ResponseEntity.ok(new ApiResponse("Postavte avtomat please"));
    }
}
