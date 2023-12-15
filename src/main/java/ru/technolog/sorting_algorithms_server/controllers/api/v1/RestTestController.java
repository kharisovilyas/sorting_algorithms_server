package ru.technolog.sorting_algorithms_server.controllers.api.v1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.technolog.sorting_algorithms_server.entitys.dto.dtoArray;
import ru.technolog.sorting_algorithms_server.response.ApiResponse;
import ru.technolog.sorting_algorithms_server.services.saLoadArrayService;

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
                arrayDTO.setArray_data(null); // Метод для генерации случайного массива
                arrayDTO.setArray_id((long) i);
                arrayDTO.setStatusOfLoad(true);

                saLoadArrayService.addArray(arrayDTO);
            }
            return ResponseEntity.ok(new ApiResponse("Тест успешно выполнен: добавлено 100 массивов в базу данных"));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(new ApiResponse("Ошибка при выполнении теста: " + e.getMessage()));
        }
    }



}
