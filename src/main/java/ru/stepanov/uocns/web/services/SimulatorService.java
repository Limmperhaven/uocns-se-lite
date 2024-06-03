package ru.stepanov.uocns.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.stepanov.uocns.network.TControllerOCNS;
import ru.stepanov.uocns.web.interfaces.ISimulatorService;
import ru.stepanov.uocns.web.models.simulator.*;


@Service
public class SimulatorService implements ISimulatorService {

    @Autowired
    TControllerOCNS fControllerOCNS;

    @Override
    public CustomResponse custom(String request){
        String reportString = fControllerOCNS.simulateAndGetReport(0.05, request);
        return  CustomResponse.builder()
                .content(reportString)
                .build();
    }
}
