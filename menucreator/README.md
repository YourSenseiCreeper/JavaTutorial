# MenuCreator v1.0
One of my first goal was to implement the function of speed menu creating and share it with my collegues from university. I've done it before in **C#** using delegates, but **Java** forced me to dig deeper and solve it another way around. To me implementation of my solution is not far harder from the C# one ([click here](https://github.com/YourSenseiCreeper/GoodTechniquesCsharp/tree/master/Menu)). I did my best to test it and make it as compact as possible. 
## Features
- Improves **MVC** approach to the project
- Gets rid of **switch-case** usage. *Finally!*
- **Numbers** of options is not your buisness anymore!
- You can add a in-between **non-pickable text**
- Flexible

Here's example usage:
``` java
import java.util.Scanner;
import pl.piotrwereszczyns.menucreator.MenuCreator;
import pl.piotrwereszczyns.menucreator.MenuElement;

public static void program() {
		System.out.println("My Buisness card");
        Scanner sc = new Scanner(System.in);
    	BuisnessCard buisness = new BuisnessCard();
    	/**
    	 * @param sc - it's necessery to pick an option from menu
    	 * @param wrongOption - text which will display when user select option which is out of the bounds
    	 * @param escapeProgramme - either it just quits the whole programme or just quits the menu loop
    	 * @param inputMenuElements - menu elements array - creating new elements is self-explainatory. * If you pass null to second argument of MenuElement constructor - it's non-pickable text but in correct order. Other elements are still numbered 
    	 */
    	MenuCreator.menu(sc, "You picked the wrong house fool!", true, new MenuElement[] { 
    			new MenuElement("MENU: ", null),
    			new MenuElement("add buisness card", () -> buisness.addCard()),
    			new MenuElement("show all buisness cards", () -> buisness.showAllCards()),
    			new MenuElement("analyse", () -> CryptoAnalyse.analyse(sc))
    	});
    	sc.close();
	}
```
And the menu shows like this:
```
My Buisness card
MENU:
1. add buisness card
2. show all buisness cards
3. analyse
4. Exit
```
All you need to do is Add External Library **MenuCreator.jar** and start using it. Hope you'll like it.
