package ru.technolog.sorting_algorithms_server.entitys.data;

import jakarta.persistence.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sa_test_sorted_arrays")
public class saTestSortedArrayData implements IDataEntity {

    @Id
    @Column(name = "test_sorted_array_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long testSortedArrayId;

    @Column(name = "test_sorted_array_name")
    private String testSortedArrayName;

    @Column(name = "test_sorted_array")
    private List<Double> testArrayData = new ArrayList<>();

    @Column(name = "test_status_of_sorted")
    private Boolean testStatusOfSorted;

    @Column(name = "test_date_of_sorted")
    private LocalDateTime testDateOfSorted;

    @Column(name = "test_time_of_impl")
    private Duration testTimeOfImpl;

    public LocalDateTime getTestDateOfSorted() {
        return testDateOfSorted;
    }

    public void setTestDateOfSorted(LocalDateTime testDateOfSorted) {
        this.testDateOfSorted = testDateOfSorted;
    }

    public Duration getTestTimeOfImpl() {
        return testTimeOfImpl;
    }

    public void setTestTimeOfImpl(Duration testTimeOfImpl) {
        this.testTimeOfImpl = testTimeOfImpl;
    }

    public Long getTestSortedArrayId() {
        return testSortedArrayId;
    }

    public void setTestSortedArrayId(Long testSortedArrayId) {
        this.testSortedArrayId = testSortedArrayId;
    }

    public List<Double> getTestArrayData() {
        return testArrayData;
    }

    public void setTestArrayData(List<Double> testArrayData) {
        this.testArrayData = testArrayData;
    }

    public Boolean isStatusOfSorted() {
        return testStatusOfSorted;
    }

    public void setTestStatusOfSorted(boolean testStatusOfSorted) {
        this.testStatusOfSorted = testStatusOfSorted;
    }

    public String getTestSortedArrayName() {
        return testSortedArrayName;
    }

    public void setTestSortedArrayName(String testSortedArrayName) {
        this.testSortedArrayName = testSortedArrayName;
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
