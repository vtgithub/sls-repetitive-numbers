package test.sls.iterativenumbers.api;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.sls.iterativenumbers.api.model.RepetitiveNumbersRequest;
import test.sls.iterativenumbers.api.model.RepetitiveNumbersResponse;
import test.sls.iterativenumbers.service.NumbersService;

@RestController
@RequestMapping(path = "/numbers", consumes = "application/json")
public class NumbersApi {
    @Autowired
    private NumbersService numbersService;

    @ApiOperation(value = "get list of numbers and returns repetitive numbers to number of iteration map")
    @RequestMapping(method = RequestMethod.POST, path = "/iterative")
    public @ResponseBody
    RepetitiveNumbersResponse fetchIterativeNumbers(@RequestBody RepetitiveNumbersRequest repetitiveNumbersRequest){
        RepetitiveNumbersResponse repetitiveNumbersResponse = numbersService.getIterativeNumbers(repetitiveNumbersRequest);
        return repetitiveNumbersResponse;
    }
}
