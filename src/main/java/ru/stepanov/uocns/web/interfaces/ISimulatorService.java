package ru.stepanov.uocns.web.interfaces;

import ru.stepanov.uocns.common.exceptions.CommonException;
import ru.stepanov.uocns.web.models.simulator.*;

public interface ISimulatorService {
    String CUSTOM = "/simulator/custom";

    CustomResponse custom(String request) throws CommonException;
}
