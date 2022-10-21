package mx.springboot.learnjpaandhibernate.course.jdbc;

import mx.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1L,"Example01", "nestor"));
        repository.insert(new Course(2L,"Example02", "nestor"));
        repository.insert(new Course(3L,"Example03", "nestor"));

        repository.deleteById(1L);

        System.out.println(repository.findById(2L)
        );
    }
}
