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


    @Override
    public String toString() {
        return "[" +
                "model = '" + model + '\'' +
                ", series = " + series +
                ']';
    }

}