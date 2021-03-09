package com.hospital.survey.respositories;

import com.hospital.survey.models.Question;
import com.hospital.survey.models.Screening;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreeningRepository extends CrudRepository<Screening, Long>
{
    Screening findByQuestion(String question);
}
