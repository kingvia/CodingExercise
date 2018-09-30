# CodingExercise
Coding exercise for irexchange.

# Usage
Java com.irexchange.CodingExercise n k

n = Number of children stand around a circle

k = Then starting with the first child, they count out from 1 until k. The k'th child is now out and leaves the circle.

# Design Point
* Record children id and status (out or not), and loop the children list again and again to find the winning child. This will reduce the performance since it will loop the unnecessary child (out one) again and again. However with current project size, it will not cause performance issue. But it will easy to maintain since the logic and the implementation is really simple to understand.
* Record the original data (original children list) so the game can play again with different parameter k.