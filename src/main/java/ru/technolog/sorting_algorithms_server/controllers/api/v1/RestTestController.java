package ru.technolog.sorting_algorithms_server.controllers.api.v1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.technolog.sorting_algorithms_server.entitys.dto.dtoArray;
import ru.technolog.sorting_algorithms_server.response.ApiResponse;
import ru.technolog.sorting_algorithms_server.services.saLoadArrayService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/v1/tests")
public class RestTestController {
    @Autowired
    protected saLoadArrayService saLoadArrayService;

    @GetMapping("/add100Arrays")
    public ResponseEntity<ApiResponse> add100Arrays() {
        try {
            for (int i = 1; i <= 100; i++) {
                dtoArray arrayDTO = new dtoArray();
                arrayDTO.setArrayName("array - " + i);
                arrayDTO.setArrayData(generateRandomDoubleList(10));
                arrayDTO.setStatusOfLoad(true);
                arrayDTO.setDateOfLoad(LocalDateTime.now());

                saLoadArrayService.addArray(arrayDTO);
            }
            return ResponseEntity.ok(new ApiResponse("Тест успешно выполнен: добавлено 100 массивов в базу данных"));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(new ApiResponse("Ошибка при выполнении теста: " + e.getMessage()));
        }
    }

    // Метод для генерации случайного списка Double элементов
    private List<Double> generateRandomDoubleList(int size) {
        List<Double> randomDoubleList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            double randomDouble = 1.0 + (10.0 - 1.0) * random.nextDouble(); // Генерация случайного Double от 1.0 до 10.0 (включительно)
            randomDoubleList.add(randomDouble);
        }

        return randomDoubleList;
    }

}
