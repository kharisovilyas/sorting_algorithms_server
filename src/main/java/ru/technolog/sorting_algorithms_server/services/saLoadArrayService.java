package ru.technolog.sorting_algorithms_server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.technolog.sorting_algorithms_server.entitys.data.saArraysData;
import ru.technolog.sorting_algorithms_server.entitys.data.saSortedArraysData;
import ru.technolog.sorting_algorithms_server.entitys.dto.dtoArray;
import ru.technolog.sorting_algorithms_server.repository.saArrayDataRepository;
import ru.technolog.sorting_algorithms_server.repository.saSortedArrayDataRepository;
import ru.technolog.sorting_algorithms_server.response.ApiResponse;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
public class saLoadArrayService {
    // Автоматическое внедрение зависимости репозитория для работы с данными массивов
    @Autowired
    private saArrayDataRepository arrayDataRepository;
    @Autowired
    private saSortedArrayDataRepository sortedArrayDataRepository;

    // Метод для добавления массива в базу данных
    public ResponseEntity<ApiResponse> addArray(dtoArray arrayDTO) {
        // Создаем объект saArraysData и устанавливаем его поля на основе данных из DTO
        saArraysData arraysData = new saArraysData();
        arraysData.setArrayData(arrayDTO.getArray_data());
        arraysData.setArrayId(arrayDTO.getArray_id());
        arraysData.setStatusOfLoad(arrayDTO.isStatusOfLoad());

        startSortedAndSaveArray(arrayDTO);

        // Сохраняем массив в репозитории
        arrayDataRepository.save(arraysData);

        // Возвращаем успешный ответ с сообщением
        return ResponseEntity.ok(new ApiResponse("Поставьте автомат, пожалуйста"));
    }

    private void startSortedAndSaveArray(dtoArray array) {
        saSortedArraysData saSortedArraysData = new saSortedArraysData();

    }

    // Метод для удаления массива по его идентификатору
    public ResponseEntity<ApiResponse> deleteArray(Long arrayId) {
        // Пытаемся найти массив по его идентификатору
        Optional<saArraysData> saArraysDataOptional = arrayDataRepository.findById(arrayId);

        if (saArraysDataOptional.isPresent()) {
            // Если массив найден, удаляем его из репозитория
            arrayDataRepository.deleteById(arrayId);
            return ResponseEntity.ok(new ApiResponse("Удаление успешно"));
        } else {
            // Если массив не найден, возвращаем ошибку 404 с соответствующим сообщением
            return ResponseEntity.status(404).body(new ApiResponse("Этот массив не существует"));
        }
    }

    // Метод для получения списка всех массивов в виде DTO
    public List<dtoArray> getAllArrays() {
        // Получаем список всех массивов из репозитория
        List<saArraysData> arraysList = StreamSupport.stream(arrayDataRepository.findAll().spliterator(), true).toList();

        // Преобразуем список массивов в список DTO
        return arraysList.stream()
                .map(this::mapToArraysDTO)
                .toList();
    }

    // Метод для преобразования объекта saArraysData в объект dtoArray
    public dtoArray mapToArraysDTO(saArraysData saArraysData) {
        dtoArray dtoArray = new dtoArray();
        dtoArray.setArray_data(saArraysData.getArrayData());
        dtoArray.setArray_id(saArraysData.getArrayId());
        dtoArray.setStatusOfLoad(saArraysData.isStatusOfLoad());

        return dtoArray;
    }
}

