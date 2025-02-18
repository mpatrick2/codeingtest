Java version: openjdk version "21.0.6"

maven version 3.8.8

To run : java -jar codeingTest-1.0.jar org.coding.challenge.Main 7-623 8235 8-235 3434 3434 1A38B1 1381





A. How might your design differ if the list of specialties was expected to never change?
What if changes frequently?
For never changing specialties I would probably put the in an array of some type (similar to the current solution). They could either be hard coded or read in from a file.
For more frequent changes I would read them from some type of database format probably into some form of a cache. This would allow the data the data to be read into a cache that could be
refresh the cathe on a regular basis.

Thanks

