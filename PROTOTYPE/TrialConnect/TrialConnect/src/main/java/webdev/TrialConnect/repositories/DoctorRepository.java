package webdev.TrialConnect.repositories;

import org.springframework.data.repository.CrudRepository;

import webdev.TrialConnect.models.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Integer> {

}
