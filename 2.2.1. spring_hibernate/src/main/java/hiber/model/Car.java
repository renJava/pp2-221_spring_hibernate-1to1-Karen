package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
//    @OneToOne(mappedBy = "car")
//    private User user;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private Integer series;

    public Car() {
    }

    public Car(String model, Integer series) {
        this.model = model;
        this.series = series;
    }


//Походу, Getterы и Setterы вообще не кужны
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public Integer getSeries() {
//        return series;
//    }
//
//    public void setSeries(Integer series) {
//        this.series = series;
//    }

    

    @Override
    public String toString() {
        return "[" +
                "model = '" + model + '\'' +
                ", series = " + series +
                ']';
    }

}