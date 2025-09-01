package com.tienda.mascotas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VentaController {
    private List<Producto> produc = new ArrayList<>();
    private List<Venta> ven = new ArrayList<>();
    private List<Detalle_venta> detalle = new ArrayList<>();

    public VentaController(){
        produc.add (new Producto(1, "Shampoo para perros", 30,"limpieza", 4000));
        produc.add (new Producto(2, "Bravecto", 20,"medicina", 50000));
        produc.add (new Producto(3, "Nomade 20 kilos", 10,"alimentos", 30000));
        ven.add (new Venta(1, LocalDate.of(2025,5,15), "Cesar Ruffino", 100000));
        ven.add (new Venta(2, LocalDate.of(2025,5,15), "Sofia Bustamante", 12000));
        ven.add (new Venta(3, LocalDate.of(2025,9,16), "Alexa Dakiwi", 60000));
        ven.add (new Venta(4, LocalDate.of(2024,8,23), "Marcela Segovia", 4000));
        detalle.add(new Detalle_venta(1, 2, 1, 2, 100000));
        detalle.add(new Detalle_venta(2, 1, 2, 3, 12000));
        detalle.add(new Detalle_venta(3, 3, 3, 2, 60000));
        detalle.add(new Detalle_venta(4, 1, 4, 1, 4000));

    }

    @GetMapping("/ventas/dia")
    public Map<LocalDate, Integer> getVentasPorDia() {
        return ven.stream()
                .collect(Collectors.groupingBy(
                        Venta::getFecha_venta,
                        Collectors.summingInt(Venta::getTotal_venta)
                ));
    }

    @GetMapping("/ventas/mes")
    public Map<String, Integer> getVentasPorMes() {
        return ven.stream()
                .collect(Collectors.groupingBy(
                        v -> v.getFecha_venta().getYear() + "-" + v.getFecha_venta().getMonthValue(),
                        Collectors.summingInt(Venta::getTotal_venta)
                ));
    }
    
    @GetMapping("/ventas/anio")
    public Map<Integer, Integer> getVentasPorAnio() {
        return ven.stream()
                .collect(Collectors.groupingBy(
                        v -> v.getFecha_venta().getYear(),
                        Collectors.summingInt(Venta::getTotal_venta)
                ));
    }
    
}

