'''
	* Language - Python (Python3)
	* Level - Beginner

	* CodeClash Hackathon Competition
	* Technology Day - IT Section
	* Richmond College Technology Society

	Problem - Enter a string and then reverse it!
    Description: These code snippets prompt the user to enter a string and then reverse it.
                They introduce loops and string manipulation, which are important concepts for 
                beginner level hackathons.

	** Do not use any online help or AI tool like Chat GPT or Google Bard
'''


str = input("Enter a string: ")
reversed = ""
for i in range(len(str) - 1, -1, -1):
    reversed += str[i]
print("Reversed string:", reversed)