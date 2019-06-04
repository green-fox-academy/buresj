package com.testing.groot.services;

import com.testing.groot.models.Cargo;
import com.testing.groot.models.CargoStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargoServiceImp implements CargoService {

    private Cargo cargo;
    private CargoStatus cargoStatus;

    @Autowired
    public CargoServiceImp(Cargo cargo, CargoStatus cargoStatus) {
        this.cargo = cargo;
        this.cargoStatus = cargoStatus;
    }

    @Override
    public void fill(double caliber, int amount) {
        cargo.setReceived(String.valueOf(caliber));
        cargo.setAmount(amount);
        cargo.setShipStatus(amount/1250 * 100 + "%");
    }

    @Override
    public CargoStatus getStatus() {
        return this.cargoStatus;
    }
}
