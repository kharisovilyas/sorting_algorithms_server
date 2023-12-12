package ru.technolog.sorting_algorithms_server.entitys.data;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "sa_task_data")
public class saTaskData implements IDataEntity{


    public List<Double> getArray() {
        return array;
    }

    public void setArray(List<Double> array) {
        this.array = array;
    }

    public List<Double> getSorted_array() {
        return sorted_array;
    }

    public void setSorted_array(List<Double> sorted_array) {
        this.sorted_array = sorted_array;
    }

    public Long getTask_id() {
        return task_id;
    }

    public void setTask_id(Long task_id) {
        this.task_id = task_id;
    }

    @Id
    @Column(name = "task_id", unique = true)
    private Long task_id;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "array_id")
    private List<Double> array;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "sorted_array_id")
    private List<Double> sorted_array;

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
