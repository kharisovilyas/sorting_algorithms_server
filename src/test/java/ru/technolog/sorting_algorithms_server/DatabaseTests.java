package ru.technolog.sorting_algorithms_server;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import ru.technolog.sorting_algorithms_server.entitys.dto.dtoArray;
import ru.technolog.sorting_algorithms_server.services.saLoadArrayService;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootTest
public class DatabaseTests {

	@Autowired
	private saLoadArrayService saLoadArrayService;

	@Test
	public void testAdd100Arrays() {
		runTestForArraySize(100);
	}

	@Test
	public void testAdd1000Arrays() {
		runTestForArraySize(1000);
	}

	@Test
	public void testAdd10000Arrays() {
		runTestForArraySize(10000);
	}

	@Test
	public void testLoadAndSort100Arrays() {
		runLoadAndSortTest(100);
	}

	@Test
	public void testLoadAndSort1000Arrays() {
		runLoadAndSortTest(1000);
	}

	@Test
	public void testLoadAndSort10000Arrays() {
		runLoadAndSortTest(10000);
	}

	@Test
	public void testClearDatabase100Arrays() {
		runClearDatabaseTest(100);
	}

	@Test
	public void testClearDatabase1000Arrays() {
		runClearDatabaseTest(1000);
	}

	@Test
	public void testClearDatabase10000Arrays() {
		runClearDatabaseTest(10000);
	}

	private void runTestForArraySize(int arraySize) {
		Instant start = Instant.now();

		for (int i = 1; i <= arraySize; i++) {
			dtoArray arrayDTO = new dtoArray();
			arrayDTO.setArrayName("array - " + i);
			arrayDTO.setArrayData(generateRandomDoubleList(10));
			arrayDTO.setStatusOfLoad(true);
			arrayDTO.setDateOfLoad(LocalDateTime.now());

			saLoadArrayService.addArray(arrayDTO);
		}

		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);

		System.out.println("Test for adding " + arraySize + " arrays:");
		System.out.println("Success: true");
		System.out.println("Time taken: " + duration.toMillis() + " milliseconds");
	}

	private void runLoadAndSortTest(int arraySize) {
		// Implement the logic for loading and sorting 100, 1000, or 10000 arrays
		// Measure the overall time and average time per array
	}

	private void runClearDatabaseTest(int arraySize) {
	}

	private List<Double> generateRandomDoubleList(int size) {
		List<Double> randomDoubleList = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < size; i++) {
			double randomDouble = 1.0 + (10.0 - 1.0) * random.nextDouble(); // Генерация случайного Double от 1.0 до 10.0 (включительно)
			randomDoubleList.add(randomDouble);
		}

		return randomDoubleList;
	}
	// ... (other methods)
}

