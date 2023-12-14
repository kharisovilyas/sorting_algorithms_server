package ru.technolog.sorting_algorithms_server.entitys.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * data transfer object для нашей сущности
 */
public class dtoArray implements IDTOEntity {
    private Long array_id;
    private List<Double> array_data = new ArrayList<>();
    private boolean statusOfLoad;

    public boolean isStatusOfLoad() {
        return statusOfLoad;
    }

    public void setStatusOfLoad(boolean statusOfLoad) {
        this.statusOfLoad = statusOfLoad;
    }

    public dtoArray() {

    }

    public dtoArray(Long array_id, List<Double> array_data) {
        this.array_id = array_id;
        this.array_data = array_data;
    }

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
}
