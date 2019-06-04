package com.testing.groot.services;

import com.testing.groot.models.CargoStatus;

public interface CargoService {

    void fill (double caliber, int amount);
    CargoStatus getStatus();
}
