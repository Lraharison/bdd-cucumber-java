Feature: PersonRepository 

Scenario: Ajouter une personne
	Given La liste des personnes est vide
	When On ajoute Koto dans la liste
	Then La liste contenant Koto et la taille de la liste est egale a 1
	

Scenario: Supprimer une personne
	Given La liste contient des personnes et contient Koto
	When On supprime Koto
	Then On ne trouve plus Koto dans la liste