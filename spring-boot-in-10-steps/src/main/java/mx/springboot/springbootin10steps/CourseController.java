package mx.springboot.springbootin10steps;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1L, "Learn 1", "example"),
                new Course(2L, "Learn 2", "example"),
                new Course(3L, "Learn 3", "example"),
                new Course(4L, "Learn 4", "example"),
                new Course(5L, "Learn 5", "example")

        );
    }
}
