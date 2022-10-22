package mx.springboot.learnjpaandhibernate.course.jpa;

import mx.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(Long id){
        return entityManager.find(Course.class, id);
    }

    public void deleteById(Long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

}
