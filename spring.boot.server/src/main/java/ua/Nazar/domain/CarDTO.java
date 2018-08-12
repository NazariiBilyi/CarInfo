package ua.Nazar.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CarDTO {
	
	private Long id;
	
	private String carId;
	
	private String make;
	
	private String model;
	
	private String color;
	
	private String image;
	
	private BigDecimal engine;
	
	private BigDecimal price;
	
	private LocalDate modeYear;
	
	private String transmisson;
	
	private String typeOfDrive;
	
	private String fuelType;
}
