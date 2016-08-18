package com.mg.api.services.carriers;

import com.mg.api.resources.carriers.Error;
import com.mg.api.resources.carriers.Carrier;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-09T18:35:46.725-04:00")

@Api(value = "carriers", description = "the carriers API")
public interface CarriersApi {

    @ApiOperation(value = "Carriers", notes = "The Carriers Endpoint.", response = Carrier.class, responseContainer = "List", tags={ "Carriers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of Carriers", response = Carrier.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Carrier.class) })
    @RequestMapping(value = "/carriers",
        produces = { "application/json", "application/vnd.com.mercurygate.carriers.v0.1.0+json;charset=UTF-8" }, 
        consumes = { "application/json", "application/vnd.com.mercurygate.carriers.v0.1.0+json;charset=UTF-8" },
        method = RequestMethod.GET)
    ResponseEntity<List<Carrier>> findCarriers(@ApiParam(value = "Latitude component of Carrier Location.") @RequestParam(value = "latitude", required = false) Double latitude



,@ApiParam(value = "Longitude component of Carrier Location.") @RequestParam(value = "longitude", required = false) Double longitude



);

}
