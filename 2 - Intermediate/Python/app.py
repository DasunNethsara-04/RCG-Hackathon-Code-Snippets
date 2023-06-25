'''
	* Language - Python (Python3)
	* Level - Intermediate

	* CodeClash Hackathon Competition
	* Technology Day - IT Section
	* Richmond College Technology Society

	Problem - enter a sentence and then generate an acronym from the first letter of each word
    Description: These code snippets prompt the user to enter a sentence and then generate 
                an acronym from the first letter of each word. They introduce string manipulation, 
                arrays, and loops, which are important concepts for intermediate level hackathons.

	** Do not use any AI tool like Chat GPT or Google Bard
'''

# emptry list to save all the numbers
sentence = input("Enter a sentence: ")
words = sentence.split()
acronym = ""
for word in words:
    acronym += word[0]
print("Acronym:", acronym.upper())