const rootUrl = "http://localhost:8080/cars";

$(document).ready(function(){

	$('#createCarForm .btn').on('click', function(e){
		e.preventDefault();
		createCar();
	})

});

function createCar(){
	let make = $("#careMake").val();
	let model = $("#carModel").val();
	let image = $("#carImage").val();
	let color = $("#carColor").val();
	let engine = $("#carEngine").val();
	let fuel = $("#carFuel").val();
	let driveType = $("#carDriveType").val();
	let modelYear = $("#carModelYear").val();
	let transmission = $("#carTransmission").val();
	let price = $("#carPrice").val();

	let car = {
		"make": make,
		"model": model,
		"image": image,
		"color": color,
		"engine": engine,
		"fuelType": fuel,
		"typeOfDrive": driveType,
		"modelYear": modelYear,
		"transmission": transmission,
		"price": price
	};

	$.ajax({
		url: rootUrl,
		method: 'POST',
		dataType: 'json',
		contentType: 'application/json',
		data: JSON.stringify(car),

		complete: function(){
			$('#createCarForm')[0].reset();

		}
	})

}