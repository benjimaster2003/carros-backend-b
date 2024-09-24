package pe.edu.cibertec.carros_backend_b.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.carros_backend_b.dto.CarrosRequest;
import pe.edu.cibertec.carros_backend_b.dto.CarrosResponse;
import pe.edu.cibertec.carros_backend_b.service.CarrosService;

@RestController
@RequestMapping("/vehiculos")
public class CarrosControlador {

    @Autowired
    CarrosService carrosService;

    @PostMapping
    public CarrosResponse buscarVehiculo(@RequestBody CarrosRequest carrosRequest) {
        try {
            String[] datosAutos = carrosService.buscarVehiculo(carrosRequest);
            if (datosAutos == null) {
                return new CarrosResponse("01", "Error: Auto no encontrado", "", "",
                        "", "", "");
            }
            return new CarrosResponse("00", "", datosAutos[0], datosAutos[1],
                    datosAutos[2], datosAutos[3], datosAutos[4]);
        } catch (Exception e) {
            return new CarrosResponse("99", "Error: Ocurrió un problema", "",
                    "", "", "", "");
        }
    }

}
