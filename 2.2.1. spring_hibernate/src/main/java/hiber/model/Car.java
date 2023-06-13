package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @GeneratedValue(strategy = GenerationType.AUTO)
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



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        user.setCar(this);
//        this.user = user;
//    }



    @Override
    public String toString() {
        return "[" +
                "model = '" + model + '\'' +
                ", series = " + series +
                ']';
    }

}