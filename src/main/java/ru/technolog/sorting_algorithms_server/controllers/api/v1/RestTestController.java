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
}
