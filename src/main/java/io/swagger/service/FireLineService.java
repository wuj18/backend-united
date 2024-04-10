package io.swagger.service;

import io.swagger.model.FireLine;
import io.swagger.model.NewFireLine;

import java.util.List;
import java.util.Optional;

public interface FireLineService {

    List<FireLine> getAllFireLine();

    FireLine createFireLine(NewFireLine cargoContainer);

    Optional<FireLine> getFireLineById(String id);

    FireLine updateFireLine(String id, FireLine updatedFireLine);

    void deleteFireLine(String id);
}

