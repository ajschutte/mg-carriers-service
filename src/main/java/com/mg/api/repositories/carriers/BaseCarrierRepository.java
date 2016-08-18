package com.mg.api.repositories.carriers;

import com.mg.api.resources.carriers.base.BaseCarrier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Andries on 8/10/16.
 */
@Transactional
public interface BaseCarrierRepository extends CrudRepository<BaseCarrier, Long> {

    List<BaseCarrier> findByName(String name);

}
