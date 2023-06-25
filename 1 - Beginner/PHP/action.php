<?php
/*
	* Language - HTML + PHP
	* Level - Beginner

	* CodeClash Hackathon Competition
	* Technology Day - IT Section
	* Richmond College Technology Society

	Problem - Enter a string and then reverse it!
    Description: These code snippets prompt the user to enter a string and then reverse it.
                They introduce loops and string manipulation, which are important concepts for 
                beginner level hackathons.

	** Do not use any online help or AI tool like Chat GPT or Google Bard
*/

if(isset($_POST['submit'])) {
	$string = $_POST['string'];
	$reversed = "";
	for ($i = strlen($string) - 1; $i >= 0; $i--) {
	    $reversed .= $string[$i];
	}
	echo "Reversed string: " . $reversed;
}


?>