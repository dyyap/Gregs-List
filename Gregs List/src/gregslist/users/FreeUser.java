package gregslist.users;

import java.util.Scanner;

public class FreeUser {

    private double balance = 0;
    // Protected to allow use in the PremiumUser class
    protected Scanner input;

    public FreeUser(final Scanner user) {
	input = user;
    }

    public final void addMoney(final double amount) {
	balance += amount;
    }

    public final double getBalance() {
	return balance;
    }

    /**
     *
     * @return Whether the user is premium
     */
    @SuppressWarnings("static-method")
    public boolean isPremium() {
	return false;
    }

}
