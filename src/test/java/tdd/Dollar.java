package tdd;

class Dollar extends Money {

    Dollar(int amount, ) {
        this.amount = amount;
        currency = "CHF";
    }
     Money times(int multiplier){
        return new Dollar(amount * multiplier);
    }

}
