package pe.edu.cibertec.carros_backend_b.service;

import pe.edu.cibertec.carros_backend_b.dto.CarrosRequest;

import java.io.IOException;

public interface CarrosService {

    String[] buscarVehiculo(CarrosRequest carrosRequest) throws IOException;

}
