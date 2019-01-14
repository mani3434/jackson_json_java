package com.conversion;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.modules.Patient;
import com.modules.Physician;
import com.modules.Vitals;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class ReadValue {

   private static Logger logger = LogManager.getLogger(ReadValue.class);

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {

            Physician[] physicians = mapper.readValue(new File("Physician.JSON"), Physician[].class);
            Patient[] patients = mapper.readValue(new File("Patient.JSON"), Patient[].class);
            Vitals[] vitals;

            for (Physician physician : physicians) {

                String npi = physician.getNpi();
                logger.info(" "+physician.toString());

                for (Patient patient : patients) {

                    String primaryPhysician = patient.getPrimaryPhysician();
                    if (npi.equals(primaryPhysician)) {

                        logger.info("\t"+patient.toString());
                        vitals = patient.getVitals();

                        for (Vitals vital : vitals) {
                            logger.info("\t\t"+vital.toString());
                        }
                    }
                }
            }

        } catch (IOException e) {

            logger.error("Exception occured {}",e);
        }
    }
}
