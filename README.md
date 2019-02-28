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

1) OUTPUT:
Received Display Language :: Tamil
[Rooster] kokra kok kooo
Received Display Language :: Hindi
[Rooster] Cock-a-doodle-doo



2) RestFull Service

When we start the AnimalSpringBootApplication Controller will be ready .

Request : http://localhost:8080/animals

Response :

{
    "response": [
        "Bird",
        "Butterfly",
        "Cat",
        "CatterPillar",
        "Chicken",
        "ClownFish",
        "Dog",
        "Dolphin",
        "Duck",
        "Fish",
        "Frog",
        "Parrot",
        "Rooster",
        "Shark"
    ]
}



-------------------

Request  : http://localhost:8080/animal/dog
Response :

{
    "flyable": false,
    "walkable": true,
    "singable": false,
    "swimmable": true,
    "name": "Dog"
}
-------------------


Request : http://localhost:8080/animal/shark
Response:

{
    "flyable": false,
    "walkable": false,
    "singable": false,
    "swimmable": true,
    "name": "Shark",
    "makesJokes": false,
    "eatOtherFishes": true,
    "large": true,
    "colourFull": false
}
--------------------

Request: http://localhost:8080/animal/8y78r3bsdsdvndfkvodivev
Response:

{
    "flyable": false,
    "walkable": false,
    "singable": false,
    "swimmable": false,
    "name": "Animal"
}

---------------------

Request : http://localhost:8080/animals/count

Response :

[
    {
        "noOfFlyingAnimals": 4,
        "animals": [
            "Bird",
            "Rooster",
            "Parrot",
            "Butterfly"
        ]
    },
    {
        "animals": [
            "Bird",
            "Duck",
            "Chicken",
            "Rooster",
            "Parrot",
            "Frog",
            "Dog",
            "CatterPillar",
            "Butterfly",
            "Cat"
        ],
        "noOfWalkingAnimals": 10
    },
    {
        "noOfSwimmingAnimals": 7,
        "animals": [
            "Duck",
            "Fish",
            "Shark",
            "ClownFish",
            "Dolphin",
            "Frog",
            "Dog"
        ]
    },
    {
        "noOfSingingAnimals": 5,
        "animals": [
            "Bird",
            "Duck",
            "Chicken",
            "Rooster",
            "Parrot"
        ]
    }
]


