<?php

$first_name = filter_input(INPUT_POST, 'first_name');
$last_name = filter_input(INPUT_POST, 'last_name');
$email = filter_input(INPUT_POST, 'email');
$phone_number = filter_input(INPUT_POST, 'phone_number');
$address = filter_input(INPUT_POST, 'address');

if(!empty($first_name)) {
if(!empty($last_name)){
if(!empty($email)){
if(!empty($phone_number)){
if(!empty($address)){

    $host = "localhost";
    $dbusername = "root";
    $dbpassword = "";
    $dbname = "ecom_website";

    $conn = new mysqli ($host, $dbusername, $dbpassword, $dbname);

    if(mysqli_connect_error()){
        die('Connect Error('. mysqli_connect_errno().')'
        .mysqli_connect_error());
    }
        else {
            $sql = "INSERT INTO customer (first_name, last_name, email, phone_number, address)
            values ('$first_name', '$last_name', '$email', '$phone_number', '$address')";
            if ($conn->query($sql)){
                echo "New customer added";
            }
            else {
                echo "Error: ".$sql."<br>". $conn->error;
            }
            $conn->close();
        }
} else {
    echo "Address is required.";
    die();
}
    }
else {
    echo "Phone number is required.";
    die();
}
    }
else {
    echo "Email is required.";
    die();
}
    }
else {
    echo "Last name is required.";
    die();
}
    }
    else {
        echo "First name is required.";
        die();
    }
?>