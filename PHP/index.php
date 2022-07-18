<?php

require_once('car.php');
require_once('account.php');

$car = new Car("ASD123", new Account("Andres Herrera", "12456789"));
$car->printDataCar();