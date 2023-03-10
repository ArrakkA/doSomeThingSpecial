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

    public TestExample(){
    }

    public TestExample(String id, int num, String content){
        this.id = id;
        this.num = num;
        this.content = content;

    }

    public String getId() {
        return id;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
