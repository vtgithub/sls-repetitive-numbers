package test.sls.iterativenumbers.service;

import org.springframework.stereotype.Service;
import test.sls.iterativenumbers.api.model.RepetitiveNumbersRequest;
import test.sls.iterativenumbers.api.model.RepetitiveNumbersResponse;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

@Service
public class NumbersService {


    public RepetitiveNumbersResponse getIterativeNumbers(RepetitiveNumbersRequest repetitiveNumbersRequest) {
        Map<Integer, Integer> repetitiveMap = getRepetitiveMap(repetitiveNumbersRequest.getNumberList());
        return new RepetitiveNumbersResponse(repetitiveMap);
    }

    //--------------  gets list of numbers and returns number to iteration map
    private Map<Integer, Integer> getRepetitiveMap(List<Integer> numberList) {
        Map<Integer, Integer> repetitiveMap = new HashMap<Integer, Integer>();
        Hashtable hashtable = new Hashtable(numberList.size());
        for (Integer number : numberList) {
            Integer collisionResult = (Integer) hashtable.put(number, number);
            if ( collisionResult!=null && collisionResult.equals(number)){
                Integer repetitiveCounter = repetitiveMap.get(number);
                if (repetitiveCounter != null)
                    repetitiveMap.put(number, ++repetitiveCounter);
                else
                    repetitiveMap.put(number, 2);
            }
        }
        return repetitiveMap;
    }
}
