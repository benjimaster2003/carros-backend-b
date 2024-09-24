package pe.edu.cibertec.carros_backend_b.dto;

public record CarrosResponse(String codigo, String mensaje, String autoMarca,
                             String autoModelo, String autoNroAsientos, String autoPrecio, String autoColor) {
}
