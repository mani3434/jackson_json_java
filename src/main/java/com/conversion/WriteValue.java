package com.conversion;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.modules.Patient;
import com.modules.Physician;
import com.modules.Vitals;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.File;
import java.io.IOException;


public class WriteValue {

    private static Logger logger = LogManager.getLogger(WriteValue.class);

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        try {

            Patient patient = new Patient();
            Vitals[] vitals = new Vitals[1];
            vitals[0] = new Vitals();

            patient.setFirstName("Mani");
            patient.setLastName("Earla");
            patient.setDateOfBirth("1992-11-20");
            patient.setInsuranceId("123456789");
            patient.setPrimaryPhysician("Jagadesh");
            patient.setAddress("3806 Sunny slope road");
            patient.setCity("BridgeWater");
            patient.setState("NJ");
            patient.setZip("08807");
            patient.setPhone("660-528-0910");

            vitals[0].setDate("2019-01-13");
            //vitals[0].setHeight("5.8");
            //vitals[0].setWeight("60");
            //vitals[0].setBmi("20.1");
            vitals[0].setA1c("4.0");
            vitals[0].setBpDiastolic("80");
            vitals[0].setBpSystolic("100");

            patient.setVitals(vitals);
            mapper.writeValue(new File("writePatient.JSON"), patient);

            Physician physician = new Physician();
            physician.setFirstName("Jagadesh");
            physician.setLastName("Earla");
            physician.setDateOfBirth("1989-10-20");
            physician.setAddress("2111 Holly Hall Street");
            physician.setCity("Houston");
            physician.setState("TX");
            physician.setZip("077054");
            physician.setPhone("832-212-8168");
            physician.setNpi("123456");
            physician.setPracticeName("UH");

            mapper.writeValue(new File("writePhysician.JSON"), physician);
        } catch (IOException e) {
            logger.error(" "+e);
        }

    }
}
