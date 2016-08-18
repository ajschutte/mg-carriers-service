package com.mg.api.services.carriers;

import com.mg.api.resources.carriers.Error;
import com.mg.api.resources.carriers.Carrier;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-09T18:35:46.725-04:00")

@Controller
public class CarriersApiController implements CarriersApi {

    public ResponseEntity<List<Carrier>> findCarriers(@ApiParam(value = "Latitude component of Carrier Location.") @RequestParam(value = "latitude", required = false) Double latitude



,
        @ApiParam(value = "Longitude component of Carrier Location.") @RequestParam(value = "longitude", required = false) Double longitude



) {
        // do some magic!
        return new ResponseEntity<List<Carrier>>(HttpStatus.OK);
    }

}
