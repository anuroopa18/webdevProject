package webdev.TrialConnect.repositories;

import org.springframework.data.repository.CrudRepository;

import webdev.TrialConnect.models.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer> {

}
