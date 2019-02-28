#Animals Classification using Inheritance
Tools:
    Java : 1.8
    IntelliJ Idea
    Maven Build Tool

1) Defined 4 interfaces which has the Activities possiblities when the Animal is in Air/Land/Water.
2) Animal DTO which helps to identify activities possible for an Animal.


Answer For A.3
1. Rooster class sing() method is called.
2. Rooster is a Adult Male in the Chicken Family
3. Delegation is used to relate Rooster to chicken with out using inheritance.



Answer For A.4
Any Class should implment Activty which has the sound can be set in the Parrot Class. Corresponding sound will be played by parrot.


Answer For B.1
Fish Model Created by extending Animal and implementing WaterActivity


Answer For B.3
1) Dolphin Model Created by extending Animal and implementing WaterActivity
2) Fish CLass was not inherited
3) No Duplicate, Since the swimming is a seperate activity


Answer For E

After Executing the CountingAnimals main method

OUTPUT:
Total Number of Animals :: 14
No Of Animals Can Fly :: 4 and the Animals are : [Bird, Rooster, Parrot, Butterfly]
No Of Animals Can Walk :: 10 and the Animals are : [Bird, Duck, Chicken, Rooster, Parrot, Frog, Dog, CatterPillar, Butterfly, Cat]
No Of Animals Can Sing :: 5 and the Animals are : [Bird, Duck, Chicken, Rooster, Parrot]
No Of Animals Can Swim :: 7 and the Animals are : [Duck, Fish, Shark, ClownFish, Dolphin, Frog, Dog]


BONUS:

OUTPUT:
Received Display Language :: Tamil
[Rooster] kokra kok kooo
Received Display Language :: Hindi
[Rooster] Cock-a-doodle-doo

