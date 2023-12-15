package ru.technolog.sorting_algorithms_server.entitys.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * data transfer object для нашей сущности
 */
public class dtoArray implements IDTOEntity {
    private String arrayName;
    private Long arrayId;
    private LocalDateTime dateOfLoad;

    public LocalDateTime getDateOfLoad() {
        return dateOfLoad;
    }

    public void setDateOfLoad(LocalDateTime dateOfLoad) {
        this.dateOfLoad = dateOfLoad;
    }

    private List<Double> arrayData = new ArrayList<>();
    private boolean statusOfLoad;

    public boolean isStatusOfLoad() {
        return statusOfLoad;
    }

    public void setStatusOfLoad(boolean statusOfLoad) {
        this.statusOfLoad = statusOfLoad;
    }

    public dtoArray() {

    }


    public String getArrayName() {
        return arrayName;
    }

    public void setArrayName(String arrayName) {
        this.arrayName = arrayName;
    }

    public Long getArrayId() {
        return arrayId;
    }

    public void setArrayId(Long arrayId) {
        this.arrayId = arrayId;
    }

    public List<Double> getArrayData() {
        return arrayData;
    }

    public void setArrayData(List<Double> arrayData) {
        this.arrayData = arrayData;
    }
}
