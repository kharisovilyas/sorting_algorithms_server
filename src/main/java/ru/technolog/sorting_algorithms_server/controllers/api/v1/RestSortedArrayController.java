package ru.technolog.sorting_algorithms_server.controllers.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.technolog.sorting_algorithms_server.entitys.data.saArraysData;

import ru.technolog.sorting_algorithms_server.entitys.data.saSortedArraysData;
import ru.technolog.sorting_algorithms_server.entitys.dto.dtoSortedArrays;
import ru.technolog.sorting_algorithms_server.repository.SortedArrayDataRepository;
import ru.technolog.sorting_algorithms_server.response.ApiResponse;

@Service
public class RestSortedArrayController {
    @Autowired
    private SortedArrayDataRepository sortedArrayDataRepository;


    public ResponseEntity<ApiResponse> addArray(dtoSortedArrays sortedArraysDTO){
        saSortedArraysData sortedArraysData = new saSortedArraysData();
        sortedArraysData.setArrayData(sortedArraysData.getArrayData());
        sortedArraysData.setArrayId(sortedArraysData.getArrayId());
        sortedArraysData.setStatusOfSorted(sortedArraysData.isStatusOfSorted());
        return ResponseEntity.ok(new ApiResponse("Postavte avtomat please"));
    }
}
