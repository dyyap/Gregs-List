package gregslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gregslist.users.FreeUser;
import gregslist.users.PremiumUser;

public class GregsProgram {

    private static final Scanner input = new Scanner(System.in);
    /**
     * The list of all items available for purchase.
     */
    private static final List<ItemToSell> itemsOnSale = new ArrayList<>();

    private static final FreeUser getUserFromType(final String type) {
	if (type.startsWith("f"))
	    return new FreeUser(input);
	else if (type.startsWith("p"))
	    return new PremiumUser(input);
	// Something is wrong
	return null;
    }

    @SuppressWarnings("null")
    public static void main(final String[] args) {
	System.out.println("Welcome to Greg's list. Are you a free or premium user?");

	String userType = input.next().toLowerCase();

	// Lock to get a correct user type
	while ((userType.contains("f") || userType.contains("p")) == false) {
	    System.out.print("Incorrect user type! Please type either (f)ree or (p)remium: ");
	    userType = input.next().toLowerCase();
	    System.out.println("\nType entered: " + userType);
	}
	// Can hold both types of user
	FreeUser user = getUserFromType(userType);

	// Checks if the getUserFromType method returned null. CRASH LOUDLY!
	if (user == null) {
	    System.err.println("User type was not set correctly! Exiting...");
	    System.exit(0);
	}
	// TODO: Remove this line? (was test)
	System.out.println("Premium User: " + user.isPremium());

    }

}
