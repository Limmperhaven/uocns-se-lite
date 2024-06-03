package ru.stepanov.uocns.web.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.stepanov.uocns.common.exceptions.CommonException;
import ru.stepanov.uocns.web.interfaces.ISimulatorService;
import ru.stepanov.uocns.web.models.simulator.*;
import ru.stepanov.uocns.web.services.SimulatorService;

@RestController
public class SimulatorEndpoint implements ISimulatorService {

    @Autowired
    SimulatorService simulatorService;

    @Override
    @CrossOrigin
    @RequestMapping(value = CUSTOM, method = RequestMethod.POST, consumes = "application/xml")
    public CustomResponse custom(@RequestBody String request) throws CommonException {
        return simulatorService.custom(request);
    }
}
