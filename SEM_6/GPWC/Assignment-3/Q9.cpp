/*
Algorithm for Right Key Press in Timber Game

1. Check Input Status → Proceed only if activeInput == true.  
2. Detect Key Press → If sf::Keyboard::Right is pressed:  
3. Move Player → Shift player to the right side.  
4. Chop Tree → Play chop sound and remove a tree section.  
5. Activate Log → Set logActive = true and move log.  
6. Update Score & Time → Increase score and extend time.  
7. Check Collision → If a branch is in the new position, trigger game over.  
8. Render Updates → Redraw game elements and refresh display.
*/