package ru.technolog.sorting_algorithms_server.entitys.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/*Класс описывающий сущности уже отсортированного массива*/
@Entity
@Table(name = "sa_sorted_arrays")
public class saSortedArraysData implements IDataEntity {
    @Id
    @Column(name = "sorted_array_id" , unique = true)
    private Long arrayId;
    @Column(name = "sorted_array_name")
    private String sortedArrayName;

    @Column(name = "sorted_array")
    private List<Double> arrayData = new ArrayList<>();

    @Column(name = "status_of_sorted")
    private boolean statusOfSorted;

    @Column(name = "date_of_sorted")
    private Duration dateOfSorted;

    public Duration getDateOfSorted() {
        return dateOfSorted;
    }

    public void setDateOfSorted(Duration dateOfSorted) {
        this.dateOfSorted = dateOfSorted;
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

    public boolean isStatusOfSorted() {
        return statusOfSorted;
    }

    public void setStatusOfSorted(boolean statusOfSorted) {
        this.statusOfSorted = statusOfSorted;
    }

    public String getSortedArrayName() {
        return sortedArrayName;
    }

    public void setSortedArrayName(String sortedArrayName) {
        this.sortedArrayName = sortedArrayName;
    }

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
