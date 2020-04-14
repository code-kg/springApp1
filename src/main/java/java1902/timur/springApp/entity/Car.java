package java1902.timur.springApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "car")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "model", nullable = false)
    private String model;
    @Column(name = "engine_power", nullable = false)
    private Integer enginePower;
    @Column(name = "year_of_issue", nullable = false)
    private Integer yearOfIssue;
}
