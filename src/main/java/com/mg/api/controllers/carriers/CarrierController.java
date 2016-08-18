package com.mg.api.controllers.carriers;

import com.mg.api.repositories.carriers.BaseCarrierRepository;
import com.mg.api.resources.carriers.base.BaseCarrier;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by Andries on 8/9/16.
 */
@Api(value = "carriers", description = "the  Carriers API")
@RestController
public class CarrierController {

    private static final Logger logger = LoggerFactory.getLogger(CarrierController.class);

    @Autowired
    private BaseCarrierRepository repository;

    @RequestMapping(value = "/carrier/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public BaseCarrier carrier(@PathVariable(value="name") String name) {

        logger.info("INVOKING carrier(..)..Carrier Passed: {}..", name);

        BaseCarrier carrier = repository.save(new BaseCarrier(name));

        for (BaseCarrier savedCarrier:repository.findAll()) {
            logger.info("Carrier found: {}..", savedCarrier);
        }

        return carrier;
    }

}
