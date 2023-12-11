package ru.technolog.sorting_algorithms_server.entitys.data;

import jakarta.persistence.*;

import java.util.ArrayList;
@Entity
@Table(name = "sa_arrays")
public class saArraysData implements IDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private ArrayList<Double> arrayList;

    public saArraysData(Long id, String nameOfArray, ArrayList<Double> arrayList) {
        this.id = id;
        this.arrayList = arrayList;
    }
    public ArrayList<Double> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Double> arrayList) {
        this.arrayList = arrayList;
    }

    public Long getId() {
        return id;
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
