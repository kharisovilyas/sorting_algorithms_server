package ru.technolog.sorting_algorithms_server.entitys.dto;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class dtoSortedArray {
    private Long array_id;
    private String sortedArrayName;
    private Duration dateOfSorted;

    public Duration getDateOfSorted() {
        return dateOfSorted;
    }

    public void setDateOfSorted(Duration dateOfSorted) {
        this.dateOfSorted = dateOfSorted;
    }

    public String getSortedArrayName() {
        return sortedArrayName;
    }

    public void setSortedArrayName(String sortedArrayName) {
        this.sortedArrayName = sortedArrayName;
    }

    private List<Double> array_data = new ArrayList<>();
    private boolean statusOfSorted;

    public Long getArray_id() {
        return array_id;
    }

    public void setArray_id(Long array_id) {
        this.array_id = array_id;
    }

    public List<Double> getArray_data() {
        return array_data;
    }

    public void setArray_data(List<Double> array_data) {
        this.array_data = array_data;
    }

    public boolean isStatusOfSorted() {
        return statusOfSorted;
    }

    public void setStatusOfSorted(boolean statusOfSorted) {
        this.statusOfSorted = statusOfSorted;
    }
}
