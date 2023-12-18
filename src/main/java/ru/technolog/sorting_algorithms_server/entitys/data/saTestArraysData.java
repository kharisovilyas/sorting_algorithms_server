package ru.technolog.sorting_algorithms_server.entitys.data;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sa_test_arrays")
public class saTestArraysData implements IDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_array_id")
    private Long testArrayId;

    @Column(name = "test_array_name")
    private String testArrayName;

    @Column(name = "test_array_data")
    private List<Double> testArrayData = new ArrayList<>();
    @Column(name = "test_status_of_load")
    private boolean testStatusOfLoad;

    @Column(name = "test_date_of_load")
    private LocalDateTime testDateOfLoad;

    public LocalDateTime getTestDateOfLoad() {
        return testDateOfLoad;
    }

    public void setTestDateOfLoad(LocalDateTime testDateOfLoad) {
        this.testDateOfLoad = testDateOfLoad;
    }

    public String getTestArrayName() {
        return testArrayName;
    }

    public void setTestArrayName(String testArrayName) {
        this.testArrayName = testArrayName;
    }
    public Boolean isTestStatusOfLoad() {
        return testStatusOfLoad;
    }

    public void setTestStatusOfLoad(Boolean testStatusOfLoad) {
        this.testStatusOfLoad = testStatusOfLoad;
    }

    public Long getArrayId() {
        return testArrayId;
    }

    public void setArrayId(Long arrayId) {
        this.testArrayId = arrayId;
    }

    public List<Double> getTestArrayData() {
        return testArrayData;
    }

    public void setTestArrayData(List<Double> testArrayData) {
        this.testArrayData = testArrayData;
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
