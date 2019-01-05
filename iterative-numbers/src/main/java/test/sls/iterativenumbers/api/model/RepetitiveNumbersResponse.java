package test.sls.iterativenumbers.api.model;

import java.util.Map;

public class RepetitiveNumbersResponse {
    private Map<Integer, Integer> numberToIterationMap;


    public RepetitiveNumbersResponse(Map<Integer, Integer> numberToIterationMap) {
        this.numberToIterationMap = numberToIterationMap;
    }

    public Map<Integer, Integer> getNumberToIterationMap() {
        return numberToIterationMap;
    }

    public void setNumberToIterationMap(Map<Integer, Integer> numberToIterationMap) {
        this.numberToIterationMap = numberToIterationMap;
    }
}
