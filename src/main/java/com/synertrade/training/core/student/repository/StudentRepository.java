package com.synertrade.training.core.student.repository;

import com.synertrade.training.core.common.repository.BaseRepository;
import com.synertrade.training.core.student.StudentEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by tudorg on 10/18/2016.
 */
@Repository
public interface StudentRepository extends BaseRepository<StudentEntity, Integer> {

}
