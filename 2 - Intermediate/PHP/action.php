<?php
/*
	* Language - HTML + PHP
	* Level - Intermediate

	* CodeClash Hackathon Competition
	* Technology Day - IT Section
	* Richmond College Technology Society

	Problem - enter a sentence and then generate an acronym from the first letter of each word
    Description: These code snippets prompt the user to enter a sentence and then generate 
                an acronym from the first letter of each word. They introduce string manipulation, 
                arrays, and loops, which are important concepts for intermediate level hackathons.

	** Do not use any online help or AI tool like Chat GPT or Google Bard
*/

if(isset($_POST['submit'])) {
	$string = $_POST['string'];
	$words = explode(" ", $string);
	$acronym = "";
	foreach ($words as $word) {
	    $acronym .= $word[0];
	}
	echo "Acronym: " . strtoupper($acronym);
}


?>