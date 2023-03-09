package gms.something.special.sample.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestJpaRepository extends JpaRepository<TestExample, String> {

}
