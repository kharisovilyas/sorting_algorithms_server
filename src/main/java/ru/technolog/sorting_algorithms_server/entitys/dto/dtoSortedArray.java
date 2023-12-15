package ru.technolog.sorting_algorithms_server.entitys.dto;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class dtoSortedArray {
    private Long sortedArrayId;
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

    public Long getSortedArrayId() {
        return sortedArrayId;
    }

    public void setSortedArrayId(Long sortedArrayId) {
        this.sortedArrayId = sortedArrayId;
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
