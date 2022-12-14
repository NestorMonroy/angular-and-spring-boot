package mx.springboot.learnjpaandhibernate.course;

import mx.springboot.learnjpaandhibernate.course.Course;
import mx.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import mx.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import mx.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//  private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;
    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        //repository.insert(new Course(1L,"Example01", "nestor"));
        repository.save(new Course(1L,"Example01", "nestor"));
        repository.save(new Course(2L,"Example02", "nestor"));
        repository.save(new Course(3L,"Example03", "nestor03"));
        repository.save(new Course(4L,"Example04", "nestor"));


        repository.deleteById(1L);

        System.out.println(repository.findById(2L));
        System.out.println(repository.count());
        System.out.println(repository.findAll());
        System.out.println(repository.findByAuthor("nestor03"));
        System.out.println(repository.findByName("Example04"));

    }
}
