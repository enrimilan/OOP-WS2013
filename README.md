Welche Aufgabe zu lösen ist
==============
Die Automatisierung macht auch vor dem Mixen von Cocktails keinen Halt (Roböxotica). Jeder Cocktail hat einen eindeutigen Namen, eine Gesamtmenge (in Milliliter als ganze Zahl) und die Namen von bis zu drei verschiedenen Flüssigkeiten. Bei einem alkoholischen Cocktail ist zusätzlich der Alkoholgehalt bekannt (die gewichtete Summe des Alkoholgehalts aller Zutaten). Weiters gibt es noch Cocktails, die mit Crusheis serviert werden (dabei wird die Menge Eis in Gramm (Gleitkommazahl) mit angegeben), oder Cocktails die heiß serviert werden (dabei wird die Temperatur in Grad (ganze Zahl) mit angegeben). Die Cocktails werden von Cocktailrobotern gemixt, die nur eine bestimmte Art von Cocktail mischen können. Einfache Roboter mixen Cocktails mit bis zu drei unterschiedlichen Flüssigkeiten aus einer Menge von 20 verschiedenen Flüssigkeiten. Ein Roboter speichert von Flüssigkeiten die Namen und die verfügbaren Mengen (in ganzahligen Milliliter) und von alkoholischen Flüssigkeiten zusätzlich die Alkoholgehalte. Dann gibt es noch Roboter, die zusätzlich Eis hinzufügen können (ein Roboter speichert die verfügbare Menge in Gramm (Gleitkommazahl)) und Roboter die den Cocktail erhitzen können. Auf einer Cocktailkarte sind alle verfügbaren Cocktails mit allen ihren Zutaten inklusive ihrer Mengen (in ganzahligen Milliliter) und den Informationen, ob sie heiß oder mit Eis gekühlt sind, aufgelistet. Eine Bestellung eines Gasts enthält eine beliebige Anzahl an Namen von Cocktails, die auch mehrfach vorkommen können. Als Ergebnis erhält man ein Serviertablett mit Cocktails.

Schreiben Sie ein Javaprogramm, das eine automatisierte Cocktailbar simuliert. Entwickeln Sie Klassen(hierarchien) um Cocktails, Cocktailroboter, Bestellungen, Serviertabletts und eine Cocktailkarte darzustellen.

Folgende Methoden und Funktionalitäten sollen unterstützt werden:

- Eine Methode content für ein Serviertablett, die Beschreibungen der auf dem Serviertablett stehenden Cocktails auf die Standardausgabe ausgibt.
- Eine Methode list für eine Bestellung, die alle Positionen der Bestellung in der Standardausgabe auflistet.

Schreiben Sie eine Klasse Test, die eine Cocktailkarte erstellt, die mehrere Bestellungen erstellt, die Bestellungen auf die Standardausgabe ausgibt, entsprechende Cocktails von den Robotern mixt, ein Serviertablett befüllt und den Inhalt des Serviertabletts anzeigt.

Daneben soll die Datei Test.java wie gewohnt als Kommentar eine kurze, aber verständliche Beschreibung der Aufteilung der Arbeiten auf die einzelnen Gruppenmitglieder enthalten – wer was gemacht hat.

Da in dem Programm viele Objekte erzeugt werden, soll die Anzahl der dynamisch erzeugten Objekte gezählt werden. Kapseln sie das Zählen der Objekte in einem Aspekt und geben Sie die Anzahl am Ende des Programms am Bildschirm aus.

Quelle: https://www.complang.tuwien.ac.at/franz/oop13w9
