package project1;

import java.util.HashMap;
import java.util.Map;

public class AadharService {
    private static Map<String,Aadhar> aadhaarMap=new HashMap<>();
    static {
        aadhaarMap.put("1232332234",new Aadhar("1232332234",
                "Ashwani","Mr Anil Kumar","Agra"));
        aadhaarMap.put("1232332236",new Aadhar("1232332236",
                "Chetan","Mr Mahesh ji","Delhi"));
    }

    public Aadhar getAadhaarByNumber(String aadhaarNumber)
    {
        return aadhaarMap.get(aadhaarNumber);
    }
}
