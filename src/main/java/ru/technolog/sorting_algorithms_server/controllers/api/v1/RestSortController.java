package ru.technolog.sorting_algorithms_server.controllers.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.technolog.sorting_algorithms_server.entitys.data.saArraysData;
import ru.technolog.sorting_algorithms_server.entitys.dto.dtoArrays;
import ru.technolog.sorting_algorithms_server.repository.ArrayDataRepository;
import ru.technolog.sorting_algorithms_server.response.ApiResponse;


/*Создание класса для добавления сущностей в базу данных*/

@Service
public class RestSortController {
    @Autowired
    private ArrayDataRepository arrayDataRepository;


    public ResponseEntity<ApiResponse> addArray(dtoArrays arraysDTO){
        saArraysData arraysData = new saArraysData();
        arraysData.setArrayData(arraysDTO.getArray_data());
        arraysData.setArrayId(arraysDTO.getArray_id());
        arrayDataRepository.save(arraysData);

        return ResponseEntity.ok(new ApiResponse("Поставьте автомат жпжпжпжпжжпжпжп"));
    }
}
