package gms.something.special.sample.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test_example")
public class TestExample {

    @Id
    private String id;

    private int num;
    private String content;

}
