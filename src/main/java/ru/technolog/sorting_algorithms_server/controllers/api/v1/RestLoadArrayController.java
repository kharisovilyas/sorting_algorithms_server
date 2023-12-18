package ru.technolog.sorting_algorithms_server.controllers.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.technolog.sorting_algorithms_server.entitys.dto.dtoArray;
import ru.technolog.sorting_algorithms_server.response.ApiResponse;
import ru.technolog.sorting_algorithms_server.services.saLoadArrayService;

import java.util.List;


/*Создание класса для добавления сущностей в базу данных*/

@RestController
@RequestMapping("/api/v1/load-array")
public class RestLoadArrayController {
    // Автоматическое внедрение зависимости сервиса для обработки массивов
    @Autowired
    protected saLoadArrayService saLoadArrayService;

    // Обработка HTTP POST запроса для добавления массива
    @PostMapping("/add")
    private ResponseEntity<ApiResponse> addArrayWithSorting(@RequestBody dtoArray array) {
        return saLoadArrayService.addArrayWithSorting(array);
    }

    // Обработка HTTP POST запроса для удаления массива по индексу
    @PostMapping("/delete")
    private ResponseEntity<ApiResponse> deleteArrayByIndex(@RequestParam Long sortedArrayId) {
        return saLoadArrayService.deleteArray(sortedArrayId);
    }

    @PostMapping("/update")
    private ResponseEntity<ApiResponse> updateArrayWithSorted(@RequestParam Long sortedArrayId,@RequestBody dtoArray array) {
        return saLoadArrayService.updateArrayWithSorted(sortedArrayId,array);
    }

    // Обработка HTTP GET запроса для получения всех данных о массивах
    @GetMapping("/get/all")
    private ResponseEntity<List<dtoArray>> getAllArraysData() {
        return ResponseEntity.ok(saLoadArrayService.getAllArrays());
    }
}

