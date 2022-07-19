<?php
require_once('car.php');
class UberBlack extends Car{
    public $typeCarAccepted;
    public $satsMaterial;

    Public function __construct ($license, $driver, $typeCarAccepted, $satsMaterial){
        parent::__construct($license, $driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->satsMaterial = $satsMaterial;
        }
}
?>