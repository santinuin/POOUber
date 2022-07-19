<?php

require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('account.php');

$uberX = new UberX("ASD123", new Account("Andres Herrera", "12345678"), "Chevrolet", "Sparl");
$uberX->printDataCar();

$uberPool = new UberPool("GHJ584", new Account("Juan Gomez", "12897478"), "Dodge", "Attitude");
$uberPool->printDataCar();
?>