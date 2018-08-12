package ua.Nazar.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "car")
public class CarEntity extends BaseEntity{

	private String carId;
	
	private String make;
	
	private String model;
	
	private String color;
	
	private String image;
	
	@Column(columnDefinition = "Decimal(2,1)")
	private BigDecimal engine;
	
	@Column(columnDefinition = "Decimal(9,2)")
	private BigDecimal price;
	
	@Column(name = "model_year")
	private LocalDate modeYear;
	
	private String transmisson;
	
	@Column(name = "type_of_drive")
	private String typeOfDrive;
	
	@Column(name = "fuel_type")
	private String fuelType;
	
	
}
