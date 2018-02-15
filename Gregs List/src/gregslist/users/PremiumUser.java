package gregslist.users;

import java.util.List;
import java.util.Scanner;

import gregslist.ItemToSell;

public class PremiumUser extends FreeUser {

    public PremiumUser(final Scanner user) {
	super(user);
    }

    @Override
    public boolean isPremium() {
	return true;
    }

    public void postItemForSale(final List<ItemToSell> itemsOnSale) {

    }

}
