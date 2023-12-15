package ru.technolog.sorting_algorithms_server.entitys.data;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sa_arrays")
/*Класс для создания массива как Entity*/
public class saArraysData implements IDataEntity {
    @Id
    @Column(name = "array_id", unique = true)
    private Long arrayId;

    @Column(name = "array_name")
    private String arrayName;

    @Column(name = "array")
    private List<Double> arrayData = new ArrayList<>();
    @Column(name = "status_of_load")
    private boolean statusOfLoad;

    @Column(name = "date_of_load")
    private LocalDateTime dateOfLoad;

    public LocalDateTime getDateOfLoad() {
        return dateOfLoad;
    }

    public void setDateOfLoad(LocalDateTime dateOfLoad) {
        this.dateOfLoad = dateOfLoad;
    }

    public String getArrayName() {
        return arrayName;
    }

    public void setArrayName(String arrayName) {
        this.arrayName = arrayName;
    }
    public boolean isStatusOfLoad() {
        return statusOfLoad;
    }

    public void setStatusOfLoad(boolean statusOfLoad) {
        this.statusOfLoad = statusOfLoad;
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

    // методы пустые, интерфейс реализован для наследования
    @Override
    public Long getId() {
        return null;
    }

    @Override
    public String getGUID() {
        return null;
    }

    @Override
    public Integer getVersion() {
        return null;
    }

    @Override
    public void upVersion() {

    }
}
